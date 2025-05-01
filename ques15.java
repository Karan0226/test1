//Find the first missing positive integer.
public class ques15 {
    public static int missno(int[]arr){
        int n = arr.length;
        boolean[] visit = new boolean[n];
        for (int i =0; i<n; i++){
            if (arr[i]>0 && arr[i] <=n)
                visit[arr[i] -1] = true;
        }
        for (int i = 1; i<=n; i++){
            if(!visit[i-1]){
                return  i;
            }
        }
        return  n+1;
    }
    public static void main(String[] args){
        int[] arr ={3,5,67,5,-5,-4,3,2};
        System.out.println(missno(arr));
    }
}
