import java.util.Scanner;
import java.util.Arrays;

public class check {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n

        reverse(arr, 0, n - 1);     // Step 1: Reverse whole array
        reverse(arr, 0, k - 1);     // Step 2: Reverse first k elements
        reverse(arr, k, n - 1);     // Step 3: Reverse remaining elements
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter value of k (steps to rotate): ");
        int k = scanner.nextInt();

        rotate(arr, k);

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
