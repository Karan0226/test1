
import java.util.*;
public class str2 {
    public static boolean gram (String s1, String s2){
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
    return Arrays.equals(s1Array, s2Array);
    }
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "bello";
        System.out.println(gram(s1,s2));
    }
}
