package ru.mirea.ikbo20.pr3;

class Square extends Rectangle {
    protected double side;

    public Square() {
        side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "This " + color + " square is " + side + " in sides and is " + (isFilled() ? "filled" : "not filled") +
                ", its perimeter is " + 4 * side + " and area is " + Math.pow(side, 2);
    }
}