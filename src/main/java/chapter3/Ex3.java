package chapter3;

import java.util.Arrays;

public class Ex3 {
    static private double[] arrayOfDoubles = {125.58, 864.09, 157.45, 276.12, 347.76};

    //{125.58, 864.09, 157.45, 276.12, 347.76} unsorted

    //{864.09, 347.76, 276.12, 157.45, 125.58} descending
    //{864.09, 347.76, 347.76, 157.45, 125.58}

    //{125.58, 157.45, 276.12, 347.76, 864.09} ascending
    //{125.58, 157.45, 276.12, 864.09, 864.09}

    public static void main(String[] args) {

        displaySorting(isSorted(arrayOfDoubles));

        Arrays.sort(arrayOfDoubles);
        System.out.println("Sorting of array.");

        displaySorting(isSorted(arrayOfDoubles));
    }

    static private boolean isSorted(double[] arrayOfDoubles) {
        if (arrayOfDoubles.length <= 2) {
            return true;
        }

        double previous = arrayOfDoubles[0];
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arrayOfDoubles.length; i++) {
            if (previous < arrayOfDoubles[i]) {
                descending = false;
                if (!ascending) {
                    break;
                }
            } else if (previous > arrayOfDoubles[i]) {
                ascending = false;
                if (!descending) {
                    break;
                }
            }
            previous = arrayOfDoubles[i];
        }

        if (descending || ascending) {
            return true;
        }
        return false;
    }


    static private void displaySorting(boolean result) {
        if (result) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is unsorted.");
        }
    }
}