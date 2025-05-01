//Move all zeros to the end without changing order of non-zero elements.
public class ques8 {
    public  static void totheend(int[] arr){
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < arr.length)
            arr[count++] = 0;

    }
    public static void main (String[] args){
        int[] arr = {1,2,7,4,0,0,6,0,6,0,4,0};
        totheend(arr);
        for(int num :arr){
            System.out.print(num + " ");
        }

        }
}
