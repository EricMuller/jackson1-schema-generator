package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

/**
 * Created by M20137 on 10/07/2017.
 */

public class CalibrationPrimeSpecifiqueTitreResponse extends  CalibrationResponse{


    @JsonProperty("code")
    private int code = 0;

    @JsonProperty("message")
    private String message = "";

    @JsonProperty("prime_specifique_titre")
    private BigDecimal primeSpecifiqueTitre;

    @JsonProperty("va_date_evaluation")
    private BigDecimal vaDateEvaluation;

    @JsonProperty("lambda_lineaire_ajustes")
    private BigDecimal[] lambdaLineaireAjustes;

    @JsonProperty("echeancier_titre")
    private List<EcheanceTitreJson> echeances;

    @JsonProperty("lambda_lineaire_ajustement")
    private BigDecimal[] lambdaLineaireAjustement;

    public BigDecimal[] getLambdaLineaireAjustes() {
        return lambdaLineaireAjustes;
    }

    public void setLambdaLineaireAjustes(BigDecimal[] lambdaLineaireAjustes) {
        this.lambdaLineaireAjustes = lambdaLineaireAjustes;
    }

    public BigDecimal getPrimeSpecifiqueTitre() {
        return primeSpecifiqueTitre;
    }

    public void setPrimeSpecifiqueTitre(BigDecimal primeSpecifiqueTitre) {
        this.primeSpecifiqueTitre = primeSpecifiqueTitre;
    }

    public Collection<EcheanceTitreJson> getEcheances() {
        return echeances;
    }

    public void setEcheances(List<EcheanceTitreJson> echeances) {
        this.echeances = echeances;
    }

    public BigDecimal[] getLambdaLineaireAjustement() {
        return lambdaLineaireAjustement;
    }

    public void setLambdaLineaireAjustement(BigDecimal[] lambdaLineaireAjustement) {
        this.lambdaLineaireAjustement = lambdaLineaireAjustement;
    }

    public BigDecimal getVaDateEvaluation() {
        return vaDateEvaluation;
    }

    public void setVaDateEvaluation(BigDecimal vaDateEvaluation) {
        this.vaDateEvaluation = vaDateEvaluation;
    }
}
