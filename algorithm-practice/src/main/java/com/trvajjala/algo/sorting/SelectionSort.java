package com.trvajjala.algo.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        final int[] array = { 2, 90, 12, 1212, 992, 22 };

        Arrays.stream(doSelectionSort(array)).forEach(i -> System.out.print(i + " "));

    }

    public static int[] doSelectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int mvi = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[mvi] > array[j]) {
                    mvi = j;
                }
            }

            final int temp = array[mvi];
            array[mvi] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
