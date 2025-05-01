//Check if an array is a palindrome.
import java.util.*;
public class que4 {
    public static boolean isPalindrome(int[] arr){
        int n  = arr.length;
        for(int i = 0; i<n/2; i++){
            if(arr[i]!= arr[n-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,2,1};
        System.out.println(isPalindrome(arr1));


    }
}
