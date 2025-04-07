package miltongutierrez.solutions_regex;

import java.util.*;
import java.util.regex.*;

public class Regex {
    
    public static void main(String[] args) {
        
        Tester tester = new Tester();
        // Matching Anything But a Newline
        //tester.check("^.{3}\\..{3}\\..{3}\\..{3}$"); 
        // Matching Digits & Non-Digit Character
        //tester.checker("^\\d{2}\\D\\d{2}\\D\\d{4,}$"); // Use \\ instead of using \ 
        //tester.checker("^[0-9]\\w{4}\\.$"); // Use \\ instead of using \ 

    
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        System.out.format("%s", match);
    }   
    
}
