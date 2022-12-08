package com.sparta.sorterproject.model;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortManager;
import com.sparta.sorterproject.logging.LoggingManager;

import java.util.Arrays;

public class MergeSort implements SortManager {
    LoggingManager loggingData = new LoggingManager();
    DisplayManager displayData = new DisplayManager();

    public static String mergeSort(int[] arr,int n) {
        n = arr.length;
        if (n < 2) {
            return null;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
        return Arrays.toString(arr);
    }
    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }


    @Override
    public void displaySortedArr() {
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Merge sort: " + mergeSort(DisplayManager.displayArray(),1));
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Merge sort: " + (double)(elapsedTime/1000000000) + " Seconds");
    }
}
