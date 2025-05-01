import java.util.*;
public class str9
{
    static int solve(String s) {

        if(s.length()==0)
            return 0;
        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < s.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(s.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }

    public static void main(String args[]) {
        String s = "adasdioshasdnasln";
        System.out.println("The length of the longest substring without repeating characters is " + solve(s));

    }
}