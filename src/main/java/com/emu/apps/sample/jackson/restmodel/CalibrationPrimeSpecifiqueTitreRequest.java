package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by M20137 on 06/07/2017.
 */
public class CalibrationPrimeSpecifiqueTitreRequest extends CalibrationLambdasLineairesRequest {

    @JsonProperty("echeancier_titre")
    private Collection<EcheanceTitreJson> echeancesTitre;

    @JsonProperty("spread_implicite")
    private BigDecimal spreadImplicite;

    @JsonProperty("va_cible")
    private BigDecimal vaCible;

    @JsonProperty("calcul_prime_specifique_titre")
    private Boolean calculPrimeSpecifiqueTitre;

    public BigDecimal getVaCible() {
        return vaCible;
    }

    public void setVaCible(BigDecimal vaCible) {
        this.vaCible = vaCible;
    }

    public Collection<EcheanceTitreJson> getEcheancesTitre() {
        return echeancesTitre;
    }

    public void setEcheancesTitre(Collection<EcheanceTitreJson> echeancesTitre) {
        this.echeancesTitre = echeancesTitre;
    }

    public BigDecimal getSpreadImplicite() {
        return spreadImplicite;
    }

    public void setSpreadImplicite(BigDecimal spreadImplicite) {
        this.spreadImplicite = spreadImplicite;
    }

    public Boolean getCalculPrimeSpecifiqueTitre() {
        return calculPrimeSpecifiqueTitre;
    }

    public void setCalculPrimeSpecifiqueTitre(Boolean calculPrimeSpecifiqueTitre) {
        this.calculPrimeSpecifiqueTitre = calculPrimeSpecifiqueTitre;
    }
}