package com.sparta.sorterproject.view;

import com.sparta.sorterproject.controller.ArrayGen;
import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.logging.LoggingManager;
import com.sparta.sorterproject.controller.SortFactory;
import com.sparta.sorterproject.controller.SortManager;

import java.util.Scanner;
import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        SortFactory sortFactory =  new SortFactory();
        DisplayManager displayData = new DisplayManager();
        LoggingManager loggingData = new LoggingManager();
        ArrayGen arrayGen = new ArrayGen();
        boolean status = true;

        while(status) {
            System.out.println(displayData.displaySorts()); //Displays the menu for the sorts
            try {
                Scanner scanner = new Scanner(in);
                int sortType = Integer.parseInt(scanner.next());
                switch (sortType) {
                    case 0:
                        SortManager bubbleSortDisplay = sortFactory.getSort(0);
                        bubbleSortDisplay.displaySortedArr();
                        status=false;
                        break;

                    case 1:
                        SortManager mergeSortDisplay = sortFactory.getSort(1);
                        mergeSortDisplay.displaySortedArr();
                        status=false;
                        break;

                    case 2:
                        SortManager quickSortDisplay = sortFactory.getSort(2);
                        quickSortDisplay.displaySortedArr();
                        status=false;
                        break;

                    case 3:
                        SortManager insertionSortDisplay = sortFactory.getSort(3);
                        insertionSortDisplay.displaySortedArr();
                        status=false;
                        break;

                    case 4:
                        SortManager selectionSortDisplay = sortFactory.getSort(4);
                        selectionSortDisplay.displaySortedArr();
                        status=false;
                        break;

                    default:
                        System.err.println("Incorrect number in range please select a number between 0-5");
                }

            } catch (NumberFormatException n) {
                System.err.println("Incorrect input " + n.getMessage());
                loggingData.exceptionLog(n.getMessage());

            }

        }



    }



}