package ru.mirea.ikbo20.pr1;

public class Book {
    private String title = "Unknown title";
    private int releaseDate = 0;
    private String authorName = "Unknown author";

    public Book(String title, int releaseDate, String authorName){
        this.title = title;
        this.releaseDate = releaseDate;
        this.authorName = authorName;
    }

    public Book(){}

    public Book(String title){
        this.title = title;
    }

    public Book(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public String toString(){
        return title + " was released in " + releaseDate + " by " + authorName;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public int getReleaseDate(){
        return releaseDate;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthorName(){
        return authorName;
    }
}