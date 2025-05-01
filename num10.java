//Count the number of digits in a number.
import java.util.*;

public class num10 {
    public static int digit(int n){
        if(n==0)
            return 1;
        int coount = 0;
        while (n != 0){
            n=n/10;
            ++coount;
        }
        return coount;

    }
    public static void main(String[]args){
        int n = 123456;
        System.out.println(digit(n));
    }
}
