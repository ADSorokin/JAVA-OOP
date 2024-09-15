package service;

import model.ComplexNumber;

public class Multiplication implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary();
        double imaginary = c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal();
        return new ComplexNumber(real, imaginary);
    }
}
