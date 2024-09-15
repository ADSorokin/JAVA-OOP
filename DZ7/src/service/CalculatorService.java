package service;

import model.ComplexNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public ComplexNumber calculate(Operation operation, ComplexNumber c1, ComplexNumber c2) {


        logger.info("Calculating: {} and {}", c1, c2);
        ComplexNumber result = operation.execute(c1, c2);

        return result;
    }
}
