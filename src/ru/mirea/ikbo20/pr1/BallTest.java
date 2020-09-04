package ru.mirea.ikbo20.pr1;

public class BallTest {
    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball("red");
        Ball b3 = new Ball(3,"blue");
        Ball b4 = new Ball(8);

        b4.dyeBall("orange");
        b2.setSize(12);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
