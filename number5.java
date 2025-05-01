//Reverse the digits of an integer.
import java.util.*;

public class number5 {
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int revNum = 0;
            while(n > 0){
                int ld = n % 10;
                revNum = (revNum * 10) + ld;
                n = n / 10;
            }
            System.out.println(revNum);
        }
    }



