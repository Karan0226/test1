import java.util.*;
//Find the factorial of a number.
public class number3 {
    public static int fact(int n){
        int m = 1;
        for (int i = 1; i<= n; i++){
            m = m*i;
        }
        return m;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}
