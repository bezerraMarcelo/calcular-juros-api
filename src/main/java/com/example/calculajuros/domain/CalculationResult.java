package com.example.calculajuros.domain;

public class CalculationResult {

    private Double installmentValue;
    private Double amount;
    private Double totalInterest;

    public CalculationResult() {

    }
    public CalculationResult(Double installmentValue, Double amount, Double totalInterest) {
        this.installmentValue = installmentValue;
        this.amount = amount;
        this.totalInterest = totalInterest;
    }

    public Double getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue) {
        this.installmentValue = installmentValue;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(Double totalInterest) {
        this.totalInterest = totalInterest;
    }


}
