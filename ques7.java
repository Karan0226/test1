// Merge two sorted arrays into one sorted array.
import java.util.*;
public class ques7 {
    public static void mergeArrays(int[] ar1 , int[] ar2,int[] ar3) {
        int i = 0 , j = 0, k =0;
        int n1 = ar1.length;
        int n2 = ar2.length;

        while (i < n1 && j < n2){
            if (ar1[i] < ar2[j])
                ar3[k++] = ar1[i++];
            else
                ar3[k++] = ar2[j++];
        }
        while (i< n1)
            ar3[k++] = ar1[i++];
        while (j< n2)
            ar3[k++] = ar2[j++];
    }

    public static void main (String [] agrs){
        int [] ar1 = {1,3,5,7};
        int [] ar2 = {2,3,4,5,6};
        int [] ar3 = new int [ar1.length + ar2.length];

        mergeArrays(ar1,ar2,ar3);
        for(int value : ar3)
            System.out.print(value + " ");

    }
}
