package com.example.calculajuros.services;

import com.example.calculajuros.domain.CalculationResult;
import com.example.calculajuros.domain.Parameter;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CalculateInterestService {

    private void validate(Parameter parameter) {

        if (parameter.getValue() <= 0) {
            throw new RuntimeException("Erro");
        }

        if (parameter.getInterestPercentage() <= 0) {
            throw new RuntimeException("Erro");
        }

        if (parameter.getNumberInstallments() <= 0) {
            throw new RuntimeException("Erro");
        }

    }

    public CalculationResult calculate (Parameter parameter) {

        this.validate(parameter);

        CalculationResult calculation = new CalculationResult();

        Double percentage = (parameter.getInterestPercentage() / 100);
        Double power = Math.pow(percentage + 1, parameter.getNumberInstallments());
        Double installmentValue = (parameter.getValue() * (percentage * power)) / (power - 1);
        Double amount = installmentValue * parameter.getNumberInstallments();
        Double totalInterest = amount - parameter.getValue();

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        installmentValue = Double.parseDouble(decimalFormat.format(installmentValue).replace(",", "."));
        amount = Double.parseDouble(decimalFormat.format(amount).replace(",", "."));
        totalInterest = Double.parseDouble(decimalFormat.format(totalInterest).replace(",", "."));

        calculation.setInstallmentValue(installmentValue);
        calculation.setAmount(amount);
        calculation.setTotalInterest(totalInterest);

        return calculation;

    }

}
