package ru.mirea.ikbo20.pr10;

public class ComplexNumber {
    int real, imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = ComplexNumber.this.imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImagine() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}