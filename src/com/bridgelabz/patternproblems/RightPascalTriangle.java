package com.bridgelabz.patternproblems;

import java.util.Scanner;

public class RightPascalTriangle {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int i, j;

        System.out.print("Enter Right Pascals Number Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Pascals Triangle Number Pattern");

        for (i = 1 ; i <= rows; i++ )
        {
            for (j = 1 ; j <= i; j++ )
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (i = rows - 1; i >= 1; i-- )
        {
            for (j = 1 ; j <= i; j++ )
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}