import factory.ComplexNumberFactory;
import model.ComplexNumber;
import controller.Controller;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();


        ComplexNumber num1 = ComplexNumberFactory.createComplexNumber(6, 5);
        ComplexNumber num2 = ComplexNumberFactory.createComplexNumber(6, 5);

        controller.addComplexNum(num1, num2);
        controller.MultiplicationComplexNum(num1, num2);
        controller.DivisionComplexNum(num1, num2);




    }
}
