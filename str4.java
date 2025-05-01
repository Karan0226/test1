//Check if a string is a palindrome.
public class str4 {
    public static int ispalindrome(String s){
        int len = s.length();
        for(int i =0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len - i- 1))
                return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        String s="abba";
        System.out.println(ispalindrome(s));
    }
}
