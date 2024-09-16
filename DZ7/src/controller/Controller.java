package controller;

import factory.ComplexNumberFactory;
import model.ComplexNumber;
import service.*;
import service.CalculatorService;
import view.View;

import java.util.Scanner;

import static java.lang.System.exit;


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

    public void run() {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("������� ������������� ����� 1 �����: ");
            int r1 = scanner.nextInt();
            System.out.print("������� ������ ����� 1 �����: ");
            int i1 = scanner.nextInt();
            System.out.print("������� ������������� ����� 2 �����: ");
            int r2 = scanner.nextInt();
            System.out.print("������� ������ ����� 2 �����: ");
            int i2 = scanner.nextInt();
            ComplexNumber num1 = ComplexNumberFactory.createComplexNumber(r1, i1);

            ComplexNumber num2 = ComplexNumberFactory.createComplexNumber(r2, i2);

            addComplexNum(num1, num2);
            MultiplicationComplexNum(num1, num2);
            DivisionComplexNum(num1, num2);
            System.out.print("���� ������ ���� ������� q ��� ����� ������� ��� �����������");

                if (scanner.next().charAt(0) == 'q') {
                    scanner.close();
                    break;

                }


            }


        }

    }