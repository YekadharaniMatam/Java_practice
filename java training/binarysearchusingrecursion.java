 // Binary search using recursion
    // Time complexity O(log n) for average and worst case
    // Time complexity O(n) for best case
    // Space complexity O(log n) due to recursion stack
    // using recursion to implement binary search.benefits of recursion is that it makes the code more readable and easier to understand.
import java.util.Scanner;
public class binarysearchusingrecursion {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1; // Element not found
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid; // Element found
        } else if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, high, key); // Search in the right half
        } else {
            return binarySearch(arr, low, mid - 1, key); // Search in the left half
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, key);
        if (result != -1) {
            System.out.println("Element found at position " + (result + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}
