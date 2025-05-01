//Remove all adjacent duplicates from a string.
import java.util.*;
public class str11 {
    public static String remove(String s){
        StringBuilder sb = new StringBuilder();
    int n = s.length();
    for(int i = 0; i<n;i++){
        boolean repeated = false;
        while (i+1<n && s.charAt(i)==s.charAt(i+1)){
            repeated = true;
            i++;
        }
        if(!repeated)
            sb.append(s.charAt(i));
    }
    if(n==sb.length())
        return sb.toString();
    return remove(sb.toString());
    }
    public static void main(String[] args) {
        String s = "valideornotvalideetedjn";
        String result = remove(s);
        System.out.println(result);
    }


}
