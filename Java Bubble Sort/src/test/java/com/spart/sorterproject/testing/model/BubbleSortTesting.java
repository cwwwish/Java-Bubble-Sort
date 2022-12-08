package com.spart.sorterproject.testing.model;

import org.junit.jupiter.api.Test;
import com.sparta.sorterproject.model.BubbleSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTesting {

    // tests a normal int array
    @Test
    public void bubbleSortOutputTestNormal(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {10,40,900,4,30,90,100};
        String arrTestString = Arrays.toString(testArrNormal);
       assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[4, 10, 30, 40, 90, 100, 900]"));
    }
    // tests if an array with two values that are the same
    @Test
    public void bubbleSortOutputTestDuplicateValue(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {10,10,900,4,30,90,100};
        String arrTestString = Arrays.toString(testArrNormal);
        assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[4, 10, 10, 30, 90, 100, 900]"));
    }

    // tests if an array with all values the same
    @Test
    public void bubbleSortOutputTestAllDuplicate(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {10,10,10,10,10,10,10};
        String arrTestString = Arrays.toString(testArrNormal);
        assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[10, 10, 10, 10, 10, 10, 10]"));
    }

    // tests an array of negative values with one positive
    @Test
    public void bubbleSortOutputTestNegative(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {-10,-106,-3,-200,-2,-78,10};
        String arrTestString = Arrays.toString(testArrNormal);
        assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[-200, -106, -78, -10, -3, -2, 10]"));
    }
    //tests an empty array
    @Test
    public void bubbleSortOutputTestEmpty(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {};
        String arrTestString = Arrays.toString(testArrNormal);
        assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[]"));
    }
    //Tests a very large array of numbers
    @Test
    public void bubbleSortOutputTestLargeArray(){
        BubbleSort bubbleSortTest = new BubbleSort();
        int [] testArrNormal = {459, 320, 174, 530, 965, 21, 757, 948, 923, 42, 896, 118, 304, 303, 582, 630, 208, 29, 403, 717, 269, 292, 629, 411, 485, 508, 429, 66, 296, 926, 256, 245, 167, 997, 757, 406, 488, 231, 137, 329, 694, 786, 734, 384, 125, 53, 482, 59, 756, 772, 484, 875, 835, 287, 713, 212, 436, 88, 884, 405, 166, 959, 301, 117, 868, 244, 392, 772, 452, 983, 966, 699, 891, 639, 161, 785, 509, 470, 864, 131, 51, 926, 747, 598, 613, 442, 632, 412, 711, 635, 787, 937, 857, 78, 117, 185, 493, 238, 379, 761};
        String arrTestString = Arrays.toString(testArrNormal);
        assertTrue(bubbleSortTest.bubbleSort(testArrNormal).equals("[21, 29, 42, 51, 53, 59, 66, 78, 88, 117, 117, 118, 125, 131, 137, 161, 166, 167, 174, 185, 208, 212, 231, 238, 244, 245, 256, 269, 287, 292, 296, 301, 303, 304, 320, 329, 379, 384, 392, 403, 405, 406, 411, 412, 429, 436, 442, 452, 459, 470, 482, 484, 485, 488, 493, 508, 509, 530, 582, 598, 613, 629, 630, 632, 635, 639, 694, 699, 711, 713, 717, 734, 747, 756, 757, 757, 761, 772, 772, 785, 786, 787, 835, 857, 864, 868, 875, 884, 891, 896, 923, 926, 926, 937, 948, 959, 965, 966, 983, 997]"));
    }



}
