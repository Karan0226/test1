//Find the second largest element in an array.
import java.util.*;

public class question1 {
    public static int secondlargest (int[]arr){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n-2; i>=0; i--){
            if (arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondLargest = secondlargest(arr);

            System.out.println("Second Largest: " + secondLargest);

        }
        }
//0(n)



