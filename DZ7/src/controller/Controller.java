package controller;

import model.ComplexNumber;
import service.*;
import service.CalculatorService;
import view.View;


public class Controller {
    CalculatorService service = new CalculatorService();
    View view  =  new View();

    public void addComplexNum(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber resultAdd = service.calculate(new Addition(), num1, num2);
        view.outOnConsole("сложения: ",resultAdd);


    }

    public void MultiplicationComplexNum(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber resultMul = service.calculate(new Multiplication(), num1, num2);
        view.outOnConsole("умножения : ",resultMul);
    }


    public void DivisionComplexNum(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber resultDiv = service.calculate(new Division(), num1, num2);
        view.outOnConsole("деления : ",resultDiv);

    }

}
