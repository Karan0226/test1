//Check if a number is a palindrome.
import java.util.*;
public class number6 {
    public static boolean palindrome(int n) {
        int revnum =0;
        int dup=n;
        while(n>0){
            int id = n % 10;
            revnum = (revnum*10) +id;
            n=n/10;
        }
        if (dup==revnum){
            return true;

        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int number = 1234321;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

