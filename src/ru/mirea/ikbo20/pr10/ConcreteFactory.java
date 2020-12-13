package ru.mirea.ikbo20.pr10;

public class ConcreteFactory extends ComplexAbstractFactory {
    @Override
    public ComplexNumber createComplex() {
        return new ComplexNumber(0, 0);
    }

    @Override
    public ComplexNumber createComplex(int real, int imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}