package service;


import model.ComplexNumber;

public interface Operation {
    ComplexNumber execute(ComplexNumber c1, ComplexNumber c2);
}
