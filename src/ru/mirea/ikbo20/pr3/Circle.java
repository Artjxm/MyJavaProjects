package ru.mirea.ikbo20.pr3;

class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void Shape() {  /*???*/ }

    @Override
    public void Shape(String color, boolean filled) {  /*???*/ }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Radius of the " + color + " circle is " + radius + ", its " +
                (isFilled() ? "filled" : "not filled") + ", perimeter is  " + (2 * Math.PI * radius) +
                " and area is " + (Math.PI * Math.pow(radius, 2));
    }
}