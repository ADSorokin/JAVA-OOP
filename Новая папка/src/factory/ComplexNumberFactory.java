package factory;

import model.ComplexNumber;


    public class ComplexNumberFactory {
        public static ComplexNumber createComplexNumber(double real, double imaginary) {
            return new ComplexNumber(real, imaginary);
        }
    }

