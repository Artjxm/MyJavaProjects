package ru.mirea.ikbo20.pr3;
//pr3 1 упражнение
public abstract class Shape {
    abstract public void evalA();
    abstract public void evalP();
    abstract public double getA();
    abstract public double getP();
    abstract public void setA(double A);
    abstract public void setP(double P);
}

class Circle extends Shape {
    private double radius, P, A;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void evalA() {
        A = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void evalP() {
        P = 2 * Math.PI * radius;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getP() {
        return P;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public void setP(double P) {
        this.P = P;
    }
}

class Square extends Shape {
    private double side, P, A;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void evalA() {
        A =  Math.pow(side, 2);
    }

    @Override
    public void evalP() {
        P = 4 * side;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getP() {
        return P;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public void setP(double P) {
        this.P = P;
    }
}

class Triangle extends Shape {
    private double A, P, sideA, sideB, sideC, base, height;

    public void setSides(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setBaseAndHeight(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void evalA() {
        A = (base + height) / 2;
    }

    @Override
    public void evalP() {
        P = sideA + sideB + sideC;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getP() {
        return P;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public void setP(double P) {
        this.P = P;
    }
}