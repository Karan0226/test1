//Find the contiguous subarray with the maximum sum (Kadane's Algorithm).
public class ques9 {
    public static int maxsubarray(int[] arr){
        int r = arr[0];
        int maxend = arr[0];

        for (int i =1; i < arr.length; i++){
            maxend = Math.max(maxend + arr[i],arr[i]);

            r = Math.max(r,maxend);
        }
        return r;
    }
    public static void main (String[] args){
        int [] arr = {1,3,5,2,6,7,-9,-5,-6};
        System.out.println(maxsubarray(arr));


    }
}
