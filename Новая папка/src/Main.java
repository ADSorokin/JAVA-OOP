import factory.ComplexNumberFactory;
import model.ComplexNumber;
import service.Addition;
import service.CalculatorService;
import service.Division;
import service.Multiplication;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        ComplexNumber num1 = ComplexNumberFactory.createComplexNumber(1, 2);
        ComplexNumber num2 = ComplexNumberFactory.createComplexNumber(3, 4);

        // Addition
        ComplexNumber resultAdd = calculatorService.calculate(new Addition(), num1, num2);
        System.out.println("Addition Result: " + resultAdd);

        // Multiplication
        ComplexNumber resultMul = calculatorService.calculate(new Multiplication(), num1, num2);
        System.out.println("Multiplication Result: " + resultMul);

        // Division
        ComplexNumber resultDiv = calculatorService.calculate(new Division(), num1, num2);
        System.out.println("Division Result: " + resultDiv);
    }
}
