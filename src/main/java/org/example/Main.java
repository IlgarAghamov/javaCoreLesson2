package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] countEvens1 = {2, 1, 2, 3, 4};
        int[] countEvens2 = {2, 2, 0};
        int[] countEvens3 = {1, 3, 5};

        System.out.println(ArrayUtils.countEvens(countEvens1));  // 3
        System.out.println(ArrayUtils.countEvens(countEvens2));  // 3
        System.out.println(ArrayUtils.countEvens(countEvens3));  // 0

        int[] findDifference1 = {3, 7, 2, 9, 1};
        System.out.println(ArrayUtils.findDifference(findDifference1));  // 8

        int[] hasAdjacentZeros1 = {1, 0, 0, 2, 3};
        int[] hasAdjacentZeros2 = {1, 2, 0, 3, 0};

        System.out.println(ArrayUtils.hasAdjacentZeros(hasAdjacentZeros1));  // true
        System.out.println(ArrayUtils.hasAdjacentZeros(hasAdjacentZeros2));  // false
    }
}