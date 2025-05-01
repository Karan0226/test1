//check if prime
import java.util.*;

public class number1 {
    public static boolean prime(int n) {
        if (n<= 1)
            return false;
        for(int i = 2; i<n;i++)
            if(n%i == 0)
                return false;
        return true;



    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        boolean isprime = prime(n);
        if (isprime){
            System.out.println("is prime");

        }else{
            System.out.println("not prime");
        }

    }
}
