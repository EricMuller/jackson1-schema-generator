package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.math.BigDecimal;

/**
 * Created by M20137 on 10/07/2017.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class CalibrationLambdasLineairesResponse extends  CalibrationResponse{


    @JsonProperty("lambda_lineaire_ajustes")
    private BigDecimal[] lambdaLineaireAjustes;

    public CalibrationLambdasLineairesResponse(BigDecimal[] lambdaLineaireAjustes) {
        this.lambdaLineaireAjustes = lambdaLineaireAjustes;
    }

    public BigDecimal[] getLambdaLineaireAjustes() {
        return lambdaLineaireAjustes;
    }

    public void setLambdaLineaireAjustes(BigDecimal[] lambdaLineaireAjustes) {
        this.lambdaLineaireAjustes = lambdaLineaireAjustes;
    }
}
