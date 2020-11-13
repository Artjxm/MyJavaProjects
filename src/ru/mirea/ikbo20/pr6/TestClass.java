package ru.mirea.ikbo20.pr6;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(12, "Jeff", 120);
        students[1] = new Student(8, "Seth", 280);
        students[2] = new Student(51, "Zed", 230);
        students[3] = new Student(4, "Amos", 249);
        students[4] = new Student(25, "Ulrich", 200);

        int[] idNumber = {17, 4, 8, 3, 6, 10};

        // Сортировка вставкой
        for (int left = 0; left < idNumber.length; ++left) {
            int value = idNumber[left];

            int i = left - 1;

            for (; i >= 0; --i) {
                if (value < idNumber[i])
                    idNumber[i + 1] = idNumber[i];
                else
                    break;
            }
            idNumber[i + 1] = value;
        }

//        System.out.println(Arrays.toString(idNumber));
        SortingStudentsByGPA studentComparator = new SortingStudentsByGPA();

        int low = 0, high = students.length - 1;
        studentComparator.quickSort(students, low, high);

        for (Student s: students)
            System.out.println(s);
    }
}
