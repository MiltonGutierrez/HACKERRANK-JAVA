package miltongutierrez.hackerrank.solutions_strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(isPalindrome(A));
        
    }
    
    private static String isPalindrome(String str){
        int i = 0;
        char[] stringChars = str.toCharArray();
        boolean isPalindrome = true;
        int charLength = stringChars.length;
        while(i < charLength - 1 -i){
            if(stringChars[i] != stringChars[charLength -1 -i]){
                isPalindrome = false;
                break;
             }
            i++;
        }
        return isPalindrome ? "Yes" : "No";
    }
    
}
