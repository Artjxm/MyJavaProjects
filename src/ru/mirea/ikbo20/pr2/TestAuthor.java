package ru.mirea.ikbo20.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("William Shakespeare", "willthewrighter@gmail.com", 'm');
        Author author2 = new Author("James Blake", "thegreatreddragon@gmail.com", 'm');
        Author author3 = new Author("Michell Obama", "obama'swife@gmail.com", 'f');
        Author author4 = new Author("Kim K", 'f');

        author4.setEmail("kanyestopignoringme@gmail.com");

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(author4);

    }
}
