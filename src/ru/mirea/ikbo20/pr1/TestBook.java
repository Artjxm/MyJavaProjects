package ru.mirea.ikbo20.pr1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Lord of the flies");
        Book b3 = new Book("Little prince", 1943, "Antoine de Saint-Exupéry");

        b2.setAuthorName("William Golding");
        b2.setReleaseDate(1954);

        System.out.println(b2);
        System.out.println(b3);

        b1.setTitle("Geborgtes Leben");
        b1.setReleaseDate(1959);
        b1.setAuthorName("Erich Maria Remarque");

        System.out.println(b1);
    }
}