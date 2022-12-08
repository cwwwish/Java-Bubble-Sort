package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

public class SelectionSort implements SortManager {

    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public static String selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        return Arrays.toString(arr);
    }

    public void displaySortedArr() {
        //DISPLAY SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Selection sort: " + selectionSort(displayData.displayArray()));
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Selection sort: " + (double) (elapsedTime / 1000000000) + " Seconds");
    }

}
