//Find the GCD (Greatest Common Divisor) of two numbers.
import java.util.*;
public class number2 {
    public static int gcd(int n, int m){
        int gcd = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }

            }
        return gcd;




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = gcd(n,m);
        System.out.println( gcd(n,m));

    }
}
