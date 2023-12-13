/*
Q1. Given an array of integers, write a Java program to find and print all the duplicate elements.
 */

public class Duplicates {

    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 8, 7, 4, 5, 3, 4, 1, 6};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

/*

    Output:

    Duplicate elements are:
    5
    8
    4
 */