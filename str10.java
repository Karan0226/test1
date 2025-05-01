//Check if one string is a rotation of another.
import java.util.*;
public class str10 {
    public static boolean rotation(String s1, String s2){
        int n = s1.length();
        for(int i =0; i<n;i++){
            if(s1.equals(s2)){
                return true;
            }
            char last = s1.charAt(s1.length() -1);
            s1 = last +s1.substring(0,s1.length()-1);

        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "qwert";
        String s2 = "trewq";
        System.out.println(rotation(s1,s2));

    }
}
