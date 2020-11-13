package ru.mirea.ikbo20.pr6;
import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getGpa(), student2.getGpa());
        }

        public void quickSort(Student[] students, int low, int high) {
                if (students.length == 0)
                        return;
                if (low >= high)
                        return;

                int middle = low + (high - low) / 2;
                int pivot = students[middle].getGpa();

                int i = low, j = high;
                while (i <= j) {
                        while (students[i].getGpa() > pivot)
                                ++i;

                        while (students[j].getGpa() < pivot)
                                --j;

                        if (i <= j) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                                ++i;
                                --j;
                        }
                }

                if (low < j)
                        quickSort(students, low, j);

                if (high > i)
                        quickSort(students, i, high);
        }
}
