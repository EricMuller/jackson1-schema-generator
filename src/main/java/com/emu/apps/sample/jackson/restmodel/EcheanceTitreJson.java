package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by M10941 on 19/06/2017.
 */
@JsonPropertyOrder({"date", "annee", "nominal", "interet_cash", "interet_pik", "pnc", "total"})
public class EcheanceTitreJson {

    @JsonProperty("date")
    @JsonDeserialize(using = CustomDateDeSeserializer.class)
    private Date date;
    @JsonProperty("nominal")
    private BigDecimal nominal;
    @JsonProperty("interet_cash")
    private BigDecimal intCash;
    @JsonProperty("interet_pik")
    private BigDecimal intPix;
    @JsonProperty("pnc")
    private BigDecimal pnc;
    @JsonProperty("annee")
    private BigDecimal annee;
    @JsonProperty("total")
    private BigDecimal total;

    public EcheanceTitreJson() {
        // ne pas enlever, utilisé par jax-rs
    }

    public EcheanceTitreJson(Date date, BigDecimal nominal, BigDecimal intCash, BigDecimal intPix, BigDecimal pnc) {
        this.date = date;
        this.nominal = nominal;
        this.intCash = intCash;
        this.intPix = intPix;
        this.pnc = pnc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAnnee() {
        return annee;
    }

    public void setAnnee(BigDecimal annee) {
        this.annee = annee;
    }

    public BigDecimal getNominal() {
        return nominal;
    }

    public void setNominal(BigDecimal nominal) {
        this.nominal = nominal;
    }

    public BigDecimal getIntCash() {
        return intCash;
    }

    public void setIntCash(BigDecimal intCash) {
        this.intCash = intCash;
    }

    public BigDecimal getIntPix() {
        return intPix;
    }

    public void setIntPix(BigDecimal intPix) {
        this.intPix = intPix;
    }

    public BigDecimal getPnc() {
        return pnc;
    }

    public void setPnc(BigDecimal pnc) {
        this.pnc = pnc;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
