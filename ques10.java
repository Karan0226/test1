import java.util.*;
//Find all pairs in an array whose sum is equal to a given number.
public class ques10 {
    public static void pairarray(int arr1[], int arr2[],int n,int m ,int x )
    {
        for (int i = 0;i<n; i++)
            for(int j =0;j <m ;j++)
                if(arr1[i] + arr2[j] == x )
                    System.out.println(arr1[i]+" "+arr2[j]);
    }
    public static void main(String[] agrs){
        int [] arr1 = {1,2,3,4,54,2,2,3,4,63,2};
        int [] arr2 = {3,3,45,6,7,8};
        int x = 8;
        pairarray(arr1,arr2, arr1.length, arr2.length, x );
    }
}
