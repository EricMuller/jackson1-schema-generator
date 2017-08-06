package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by M10941 on 01/08/2017.
 */
public class CustomDateDeSeserializer extends JsonDeserializer<Date> {
    @Override
    public Date deserialize(final JsonParser jsonparser, final DeserializationContext context) throws IOException {
        final String dateString = jsonparser.getText();
        try {
            return new Date(Long.valueOf(dateString));
        } catch (final Exception e1) {
            return tryParseAsDateString(dateString);
        }
    }
    protected static Date tryParseAsDateString(final String dateString) {
        try {
            final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                return df.parse(dateString);
        } catch (final ParseException e2) {
            throw new RuntimeException(MessageFormat.format("Unable to parse {0}", dateString));
        }
    }
}
