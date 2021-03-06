package com.emu.apps.sample.jackson;


import com.emu.apps.sample.jackson.restmodel.*;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JacksonJsonSchemaGenerator {

    private static Class[] CLASSES= {MaturiteJson.class,EcheanceTitreJson.class,CalibrationLambdasLineairesRequest.class
            ,CalibrationLambdasLineairesResponse.class,CalibrationPrimeSpecifiqueTitreRequest.class,CalibrationPrimeSpecifiqueTitreResponse.class};


    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        new JacksonJsonSchemaGenerator().testJackson1();
    }

    /**
     * test with jackson 1.9.2
     *
     * @throws IOException
     */
    private void testJackson1() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.ALWAYS);

        for(Class aClass : CLASSES){
            JsonSchema schema = mapper.generateJsonSchema(aClass);
            writeSchemaToFile(mapper, schema, aClass.getSimpleName()+".json");
        }


    }

    /**
     * jenkins 1.9 de m#$%*@
     *
     * @param mapper
     * @param schema
     */
    private void updateReferenceSchema(ObjectMapper mapper, JsonSchema schema) {
        JsonNode schemaRootNode = schema.getSchemaNode();
        JsonNode jsonNode = schemaRootNode.findPath("maturites");
        if (jsonNode != null && jsonNode.isObject()) {
            ObjectNode jNode = mapper.createObjectNode();
            jNode.put("$ref", "MaturiteJson.json");
            ((ObjectNode) jsonNode).put("items", jNode);
        }

        jsonNode = schemaRootNode.findPath("echeancier_titre");
        if (jsonNode != null && jsonNode.isObject()) {
            ObjectNode jNode = mapper.createObjectNode();
            jNode.put("$ref", "EcheanceTitreJson.json");
            ((ObjectNode) jsonNode).put("items", jNode);
        }

        // pb with date should be  "type":"string", "format":"date-time"
        jsonNode = schemaRootNode.findPath("date_valo");
        if (jsonNode != null && jsonNode.isObject()) {
            ((ObjectNode) jsonNode).put("format", "date-time");
        }
        jsonNode = schemaRootNode.findPath("date");
        if (jsonNode != null && jsonNode.isObject()) {
            ((ObjectNode) jsonNode).put("format", "date-time");
        }

    }

    private void writeSchemaToFile(ObjectMapper mapper, JsonSchema schema, String fileName) throws IOException {
        updateReferenceSchema(mapper, schema);
        OutputStream os = null;
        try {
            File resourcesFile = new File("src/main/resources/json-schema/" + fileName);
            os = new FileOutputStream(resourcesFile);
            os.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema).getBytes());
            os.close();
            System.out.println("File created " + resourcesFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(os);
        }
    }

}
