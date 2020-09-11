package ru.mirea.ikbo20.pr2;

public class Author {
    private String name, email, genderName = "humanoid";
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, char gender) {
        this.name = name;
        this.gender = gender;
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

    public void setGenderName(char gender) {
        if (gender == 'm')
            genderName = "male";
        else if (gender == 'f')
            genderName = "female";
    }

    public String toString() {
        setGenderName(gender);
        return name + " is a " + genderName + " and may be contacted wia " + email;
    }
}
