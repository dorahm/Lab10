// testSelectionSort.java
import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        int[] arr = new int[] { 8, 9, 7, 10, 2 };
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        int[] expectedArr = new int[] { 2, 7, 8, 9, 10 };
        assertArrayEquals(expectedArr, sortedArr);

        // Print sorted array
        System.out.println("Sorted Array (testPositive):");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void testNegative() {
        int[] arr = new int[] { -8, -9, -7, -10, -2 };
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        int[] expectedArr = new int[] { -10, -9, -8, -7, -2 };
        assertArrayEquals(expectedArr, sortedArr);

        // Print sorted array
        System.out.println("Sorted Array (testNegative):");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void testMixed() {
           int[] arr = new int[] { -8, 9, 0, -7, 10, 2, 1 }; // changed elements here
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        int[] expectedArr = new int[] { -8, -7, 0, 0, 2, 9, 1 }; //changed elements here
        assertArrayEquals(expectedArr, sortedArr);

        // Print sorted array
        System.out.println("Sorted Array (testMixed):");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void testDuplicates() {
        int[] arr = new int[] { 8, 9, 7, 10, 2, 8, 9, 7, 10, 2 };
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        int[] expectedArr = new int[] { 2, 2, 7, 7, 8, 8, 9, 9, 10, 10 };
        assertArrayEquals(expectedArr, sortedArr);

        // Print sorted array
        System.out.println("Sorted Array (testDuplicates):");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
