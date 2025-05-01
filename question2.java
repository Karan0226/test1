//Remove duplicates from a sorted array without using extra space.
import java.util.*;
public class question2 {
    public static int duplicate(int[]arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter" + " "+ n + " " + "sorted element");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int newSize =  duplicate(arr);

        System.out.print("array after rmoving duplicates:");
        for (int i = 0; i < newSize; i++){
        System.out.print(arr[i] + " ");
    }
}
}
//tc 0(n)

