package ru.mirea.ikbo20.pr10;

public abstract class ComplexAbstractFactory {
    abstract ComplexNumber createComplex();
    abstract ComplexNumber createComplex(int real, int image);
}