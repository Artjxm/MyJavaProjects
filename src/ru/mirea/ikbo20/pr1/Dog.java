package ru.mirea.ikbo20.pr1;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n; age = a;
    }

    public Dog(String n){
        name = n;
    }

    public Dog(){
        name = "Unknown Puppy";
        age = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return this.name + "'s age is " + this.age + " years";
    }

    public void toHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }

}
