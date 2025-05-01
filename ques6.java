import java.util.Arrays;

//Find the majority element in an array (appears more than n/2 times).
public class ques6 {
    public static int majele(int[]arr){
        int n =arr.length;
        Arrays.sort(arr);
        int m =arr[n/2];
        int count =0;
        for(int num :arr){
            if (num == m){
                count++;
            }
        }
        if (count > n/2) {
            return m;
        }
        return -1;
    }

    public static void main(String[] args){
        int arr [] = {1,2,3,4,1,1,1};
        System.out.println(majele(arr));
    }
}
