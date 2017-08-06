package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 * Created by M20137 on 06/07/2017.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class CalibrationLambdasLineairesRequest {

    @JsonProperty("date_valo")
    @JsonDeserialize(using = CustomDateDeSeserializer.class)
    private Date dateValo;

    @JsonProperty("courbe_taux")
    private double[] courbeTaux;

    @JsonProperty("prime_specifique_titre")
    private BigDecimal primeSpecifiqueTitre;

    @JsonProperty("cds_5y")
    private BigDecimal cds5y;

    @JsonProperty("recovery_stec")
    private BigDecimal recoveryStec;

    @JsonProperty("maturites")
    private Collection<MaturiteJson> maturites;


    public Date getDateValo() {
        return dateValo;
    }

    public void setDateValo(Date dateValo) {
        this.dateValo = dateValo;
    }

    public double[] getCourbeTaux() {
        return courbeTaux;
    }

    public void setCourbeTaux(double[] courbeTaux) {
        this.courbeTaux = courbeTaux;
    }

    public BigDecimal getPrimeSpecifiqueTitre() {
        return primeSpecifiqueTitre;
    }

    public void setPrimeSpecifiqueTitre(BigDecimal primeSpecifiqueTitre) {
        this.primeSpecifiqueTitre = primeSpecifiqueTitre;
    }

    public BigDecimal getCds5y() {
        return cds5y;
    }

    public void setCds5y(BigDecimal cds5y) {
        this.cds5y = cds5y;
    }

    public BigDecimal getRecoveryStec() {
        return recoveryStec;
    }

    public void setRecoveryStec(BigDecimal recoveryStec) {
        this.recoveryStec = recoveryStec;
    }

    public Collection<MaturiteJson> getMaturites() {
        return maturites;
    }

    public void setMaturites(Collection<MaturiteJson> maturites) {
        this.maturites = maturites;
    }
}