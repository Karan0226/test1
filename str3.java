//Find the first non-repeating character in a string.
import java.util.*;
public class str3 {
    public static char repeat(String s){
        int n = s.length();
        for(int i =0; i<n; ++i){
            boolean found = false;
            for(int j = 0; j<n; ++j){
                if (i!=j && s.charAt(i) == s.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found)
                return s.charAt(i);
        }
        return '$';
    }
    public static void main(String[] args){
        String s = "happybirthday";
        System.out.println(repeat(s));
    }
}
