package ru.mirea.ikbo20.pr1;

public class Ball {
    private int size;
    private String color;

    public Ball(){
        size = 0;
        color = "Unknown";
    }

    public Ball(int size){
        this.size = size;
    }

    public Ball(String color){
        this.color = color;
    }

    public Ball(int size, String color){
        this.size = size;
        this.color = color;
    }

    public void dyeBall(String color) {
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String toString(){
        return "This " + color + " ball is " + size + " in size scale.";
    }
}
