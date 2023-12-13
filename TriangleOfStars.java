/*
Q3. 3. Write a Java program to print a right-angled triangle of stars. The number of rows should be taken as input.
 */

import java.util.Scanner;

public class TriangleOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*
    Output:
    *
    **
    ***
    ****
    *****

 */