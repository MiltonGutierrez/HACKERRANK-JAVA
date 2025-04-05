package miltongutierrez.hackerrank.solutions_strings;
import java.util.Scanner;
import java.util.function.Function;

/*
 * Function Description

    Complete the getSmallestAndLargest function in the editor below.

    getSmallestAndLargest has the following parameters:

        string s: a string
        int k: the length of the substrings to find

    Returns

        string: the string ' + "\n" + ' where and are the two substrings

    Input Format

    The first line contains a string denoting
    .
    The second line contains an integer denoting .
 */
public class LexicographicalSubstring{
    
    public static String getSmallestAndLargest(String s, int k) {
        String[] substrings = getSubstringsArray(s, k);
        String smallest = substrings[0];
        String largest = substrings[0];
        
        for(String str: substrings){
            if(str.compareTo(largest) > 0){
                largest = str;
            }
            if(str.compareTo(smallest) < 0){
                smallest = str;
            }
        }
        
        return smallest + "\n" + largest;
    }
    
    public static String[] getSubstringsArray(String str, int k){
        String result = "";
        char[] stringChars = str.toCharArray();
        for(int i = 0; i+k <= stringChars.length; i++){
            for(int j = i; j < k+i && j < stringChars.length; j++){
                result += stringChars[j];
            }
            result += " ";
        }
        return result.split(" ");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}