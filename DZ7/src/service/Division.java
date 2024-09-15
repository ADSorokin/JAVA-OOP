package service;

import model.ComplexNumber;

public class Division implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber c1, ComplexNumber c2) {
        double denominator = c2.getReal() * c2.getReal() + c2.getImaginary() * c2.getImaginary();
        if (denominator == 0) throw new ArithmeticException("Деление на 0");
        double real = (c1.getReal() * c2.getReal() + c1.getImaginary() * c2.getImaginary()) / denominator;
        double imaginary = (c1.getImaginary() * c2.getReal() - c1.getReal() * c2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}