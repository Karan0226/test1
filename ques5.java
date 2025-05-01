//Find the missing number in a sequence from 1 to n.
import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (the range is from 1 to n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements (missing one number from 1 to " + n + "):");
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int totalSum = n * (n + 1) / 2;
        int missingNumber = totalSum - sum;

        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
