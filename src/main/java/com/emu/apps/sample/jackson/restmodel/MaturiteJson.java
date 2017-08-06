package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.math.BigDecimal;

/**
 * Created by M20137 on 06/07/2017.
 */
public class MaturiteJson {

    @JsonProperty("maturite")
    private int maturite;

    @JsonProperty("maturite_reel")
    private BigDecimal maturiteReel;

    @JsonProperty("investment_grade")
    private BigDecimal investmentGrade;

    @JsonProperty("ecart_lambda_lineaire_ajuste")
    private BigDecimal ecartLambdaLineaireAjuste;

    public MaturiteJson() {
        // ne pas enlever , utilisé par jax-rs
    }


    public MaturiteJson(int maturite, BigDecimal maturiteReel, BigDecimal investmentGrade,BigDecimal ecartLambdaLineaireAjuste) {
        this.maturite = maturite;
        this.maturiteReel = maturiteReel;
        this.investmentGrade = investmentGrade;
        this.ecartLambdaLineaireAjuste = ecartLambdaLineaireAjuste;
    }

    public int getMaturite() {
        return maturite;
    }

    public void setMaturite(int maturite) {
        this.maturite = maturite;
    }

    public BigDecimal getMaturiteReel() {
        return maturiteReel;
    }

    public void setMaturiteReel(BigDecimal maturiteReel) {
        this.maturiteReel = maturiteReel;
    }

    public BigDecimal getInvestmentGrade() {
        return investmentGrade;
    }

    public void setInvestmentGrade(BigDecimal investmentGrade) {
        this.investmentGrade = investmentGrade;
    }

    public BigDecimal getEcartLambdaLineaireAjuste() {
        return ecartLambdaLineaireAjuste;
    }

    public void setEcartLambdaLineaireAjuste(BigDecimal ecartLambdaLineaireAjuste) {
        this.ecartLambdaLineaireAjuste = ecartLambdaLineaireAjuste;
    }
}