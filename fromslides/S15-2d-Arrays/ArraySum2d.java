//package fromslides.S15;

import java.util.Scanner;

/**
 * Create a 2d array, sum it
 *
 * @author     pmc
 * @version    slide deck 15
 */

public class ArraySum2d {
    public static void main(String[] args) {
            int[][] numbers = {
                { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12}
            };
            int total, totalAll=0;

            for (int row = 0; row < numbers.length; row++) {
                total = 0;
                for (int col = 0; col < numbers[row].length; col++)
                    total += numbers[row][col];
                System.out.println("Total of row " + row + " is " + total);
                totalAll += total;
            }
            System.out.println("Total of array is " + totalAll);

        } // end main

} // end class
