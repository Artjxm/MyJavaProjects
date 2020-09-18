package ru.mirea.ikbo20.pr3;

class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void Shape() {
        // useless m8
    }

    @Override
    public void Shape(String color, boolean filled) {
        // Продам гараж
    }

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
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle's sides are " + length + " and " + width + ", its " + color +
                " and " + (isFilled() ? "filled" : "not filled") + ", perimeter is " +
                (2 * length + 2 * width) + " and area is " + length * width;
    }
}