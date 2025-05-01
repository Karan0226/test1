//Reverse a string without using library functions.
import java.util.*;
public class str1 {
    public static String reverse(String s){
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length();i++)
        st.push(s.charAt(i));
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<s.length();i++)
            res.append(st.pop());
        return  res.toString();
    }
    public static void main(String[]args){
        String s = "qwertyu";
        System.out.println(reverse(s));


    }
}
