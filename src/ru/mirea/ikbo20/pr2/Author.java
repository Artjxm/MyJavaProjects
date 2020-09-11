package ru.mirea.ikbo20.pr2;

public class Author {
    private String name, email, genderName = "humanoid";
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

        if (gender == 'm')
            genderName = "male";
        else if (gender == 'f')
            genderName = "female";
    }

    public Author(String name, char gender) {
        this.name = name;
        this.gender = gender;

        if (gender == 'm')
            genderName = "male";
        else if (gender == 'f')
            genderName = "female";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + " is a " + genderName + " and may be contacted via " + email;
    }
}
