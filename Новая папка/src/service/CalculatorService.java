package service;

import model.ComplexNumber;



public class CalculatorService {
 //   private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public ComplexNumber calculate(Operation operation, ComplexNumber c1, ComplexNumber c2) {
        System.out.println("Calculating: {} and {}", c1, c2);
        ComplexNumber result = operation.execute(c1, c2);
        System.out.println("Result: {}", result);
        return result;
    }

}