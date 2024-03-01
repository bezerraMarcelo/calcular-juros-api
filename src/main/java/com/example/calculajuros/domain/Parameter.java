package com.example.calculajuros.domain;

public class Parameter {

    private double value;
    private double interestPercentage;
    private int numberInstallments;

    public Parameter() {
    }

    public Parameter(double value, double interestPercentage, int numberInstallments) {
        this.value = value;
        this.interestPercentage = interestPercentage;
        this.numberInstallments = numberInstallments;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getInterestPercentage() {
        return interestPercentage;
    }

    public void setInterestPercentage(double interestPercentage) {
        this.interestPercentage = interestPercentage;
    }

    public int getNumberInstallments() {
        return numberInstallments;
    }

    public void setNumberInstallments(int numberInstallments) {
        this.numberInstallments = numberInstallments;
    }
}
