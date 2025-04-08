package miltongutierrez.solutions_regex;

import java.util.*;
import java.util.regex.*;

public class RegexAlienUsername {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStrings = scan.nextInt();
        scan.nextLine();
        Tester tester = new Tester();
        String pattern = "^[_\\.][0-9]+[A-Za-z]*[_]{0,1}$";
        for(int i = 0; i < numberOfStrings; i ++){
            tester.check(pattern, scan);
        }
    }
}


class Tester {

    public void check(String pattern, Scanner scanner){
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        if(match){
            System.out.println("VALID");
        }
        else{
            System.out.println("INVALID");
        }
    }   
    
}