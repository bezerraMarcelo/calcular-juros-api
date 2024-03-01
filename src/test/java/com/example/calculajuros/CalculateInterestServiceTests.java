package com.example.calculajuros;
import com.example.calculajuros.domain.CalculationResult;
import com.example.calculajuros.domain.Parameter;
import com.example.calculajuros.services.CalculateInterestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculateInterestServiceTests {

    @Autowired
    private CalculateInterestService service;

    @Test
    void testarCalculo () {

        Parameter parameter = new Parameter();

        parameter.setValue(1000);
        parameter.setInterestPercentage(1.2);
        parameter.setNumberInstallments(12);

        CalculationResult calculationResult = service.calculate(parameter);

        assertEquals(89.98, calculationResult.getInstallmentValue());
        assertEquals(1079.71, calculationResult.getAmount());
        assertEquals(79.71, calculationResult.getTotalInterest());

    }

    @Test
    void testarCalculo_throwsException() {

        Parameter parameter = new Parameter();

        parameter.setValue(0);
        parameter.setInterestPercentage(1.2);
        parameter.setNumberInstallments(12);
        assertThrows(Exception.class, () -> service.calculate(parameter));

        parameter.setValue(1000);
        parameter.setInterestPercentage(0);
        parameter.setNumberInstallments(12);
        assertThrows(Exception.class, () -> service.calculate(parameter));

        parameter.setValue(1000);
        parameter.setInterestPercentage(1.2);
        parameter.setNumberInstallments(0);
        assertThrows(Exception.class, () -> service.calculate(parameter));

    }

}
