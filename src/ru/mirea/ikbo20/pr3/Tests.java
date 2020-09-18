package ru.mirea.ikbo20.pr3;

public class Tests {
    public static void main(String[] args) {
        Circle a = new Circle(3, "red", true);
        System.out.println(a);

        Rectangle b = new Rectangle(3, 4, "blue", true);
        System.out.println(b);

        Square c = new Square(5, "orange", false);
        System.out.println(c);
    }
}
