import java.util.*;
//Count and return the number of words in a given string.

public class str8 {
    public static void main(String[] args){
        String s = "i am happy today";
        int n = s.length();
        int spaces =0;

        for(int i =0; i<n; i++){
            if(s.charAt(i) == ' ')
                spaces = spaces + 1;
        }
        System.out.println("number of word:");
        System.out.print(spaces+1);
    }
}
