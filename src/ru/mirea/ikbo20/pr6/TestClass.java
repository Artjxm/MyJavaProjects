package ru.mirea.ikbo20.pr6;

public class TestClass {

    private static void printArray(Student[] array) {
        for (Student i: array)
            System.out.println(i + " ");
        System.out.println();
    }

    private static Student[] mergeSort(Student[] array) {
        if (array.length <= 1)
            return array;

        int midpoint = array.length / 2;

        Student[] left = new Student[midpoint];
        Student[] right;

        if (array.length % 2 == 0)
            right = new Student[midpoint];
        else
            right = new Student[midpoint + 1];

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }

        Student[] result = new Student[array.length];

        left = mergeSort(left);
        right = mergeSort(right);

        result = mergeJoin(left, right);

        return result;
    }

    private static Student[] mergeJoin(Student[] left, Student[] right) {

        Student[] result = new Student[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = resultPointer = rightPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer].getGpa() <= right[rightPointer].getGpa()){
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            }
            else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

//    public static Student[] mergeJoin()()(Student[] arr1, Student[] arr2) {
//
//        Student[] arr3 = new Student[arr1.length + arr2.length];
//
//        int i = 0, j = 0;
//        for (int k = 0; k < arr3.length; ++k) {
//            if (i > arr1.length - 1) {
//                Student temp = arr2[j];
//                arr3[k] = temp;
//                ++j;
//            } else if (j > arr2.length - 1) {
//                Student temp = arr1[i];
//                arr3[k] = temp;
//                ++i;
//            } else if (arr1[i].getGpa() < arr2[j].getGpa()) {
//                Student temp = arr1[i];
//                arr3[k] = temp;
//                ++i;
//            } else {
//                Student temp = arr2[j];
//                arr3[k] = temp;
//                ++j;
//            }
//        }
//        return arr3;
//    }

    public static void main(String[] args) {
        Student[] arrOfStudents1 = new Student[5];

        arrOfStudents1[0] = new Student(4, "Ulrich", 200);
        arrOfStudents1[1] = new Student(9, "Seth", 280);
        arrOfStudents1[2] = new Student(7, "Amos", 249);
        arrOfStudents1[3] = new Student(2, "Jeff", 120);
        arrOfStudents1[4] = new Student(6, "Zed", 230);

        Student[] arrOfStudents2 = new Student[5];

        arrOfStudents2[0] = new Student(5, "Ann", 215);
        arrOfStudents2[1] = new Student(3, "Margaret", 159);
        arrOfStudents2[2] = new Student(10, "Kate",298 );
        arrOfStudents2[3] = new Student(8, "Zai", 260);
        arrOfStudents2[4] = new Student(1, "Alison", 99);

        int[] idNumber = {17, 4, 8, 3, 6, 10};

//        Сортировка вставкой
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

        System.out.println("Chaotic ordnung\n");


        printArray(arrOfStudents1);
        printArray(arrOfStudents2);

        System.out.println("Lets sort these bois!\n");

        Student[] menSorted = mergeSort(arrOfStudents1);
        Student[] womenSorted = mergeSort(arrOfStudents2);

        printArray(menSorted);
        printArray(womenSorted);

        System.out.println("Now comes the magic of feminism!\n");

        printArray(mergeJoin(menSorted, womenSorted));
    }
}
