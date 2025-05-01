//Find the sum of digits of a number.
import java.util.*;
public class num9 {
    public static int sum(int n ){
        if(n==0)
            return 0;
        return(n%10) + sum(n/10);
        }
        public static void main(String[]args){
            System.out.println(sum(1222));
    }
}
