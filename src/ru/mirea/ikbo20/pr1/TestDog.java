package ru.mirea.ikbo20.pr1;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Iosif", 4);
        Dog d2 = new Dog("Adolf", 7);
        Dog d3 = new Dog("Winston");
        Dog d4 = new Dog();

        d3.setAge(5);

        System.out.println(d2);

        d1.toHumanAge();
        d2.toHumanAge();
        d3.toHumanAge();    
    }
}
