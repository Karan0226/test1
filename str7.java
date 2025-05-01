//Implement basic string compression using counts of repeated characters.
import java.util.*;
public class str7 {
    public static String compression(String s){
        StringBuffer sb = new StringBuffer();
        int count = 1;
        char prev = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char curr =s.charAt(i);
            if(prev == curr){
                count++;}
            else{
                sb.append(prev);
                sb.append(count);
                prev = curr;
                count = 1;

            }
        }
        sb.append(prev);
        sb.append(count);
        if(s.length()<sb.length()) {
            return s;
        }
        else{
            return sb.toString();
        }
    }
public static void main(String[] args){
        String s = "tensiiiiionnn";
    System.out.println("output:"+ compression(s));
}
}

