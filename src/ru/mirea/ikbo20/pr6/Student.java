package ru.mirea.ikbo20.pr6;

class Student {
    private int idNumber;
    private String name = "Who is this student?";
    private int gpa;

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", gpa=" + gpa;
    }

    public Student(int idNumber, String name, int gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }
}

