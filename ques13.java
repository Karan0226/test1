//Find the minimum element in a rotated sorted array.
public class ques13 {
    public static int mini(int[] arr){
        int low =0 , high = arr.length -1;
        while (low<high){
            if(arr[low]< arr[high])
                return arr[low];
            int mid = (low+high)/2;
            if(arr[mid] > arr[high])
                low =mid+1;
            else
                high =mid;
        }
        return arr[low];
    }
    public static void main(String[] args){
        int[]arr ={4,6,3,6,83,2};
        System.out.println(mini(arr));

    }
}

