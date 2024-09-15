package service;

import model.ComplexNumber;


    public class Addition implements Operation {
        @Override
        public ComplexNumber execute(ComplexNumber c1, ComplexNumber c2) {
            return new ComplexNumber(c1.getReal() + c2.getReal(), c1.getImaginary() + c2.getImaginary());
        }
    }







