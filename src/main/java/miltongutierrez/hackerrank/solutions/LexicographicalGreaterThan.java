package miltongutierrez.hackerrank.solutions;

import java.util.Scanner;

/*
 * The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,
and

, perform the following operations:

    Sum the lengths of 

and
.
Determine if
is lexicographically larger than (i.e.: does come before
in the dictionary?).
Capitalize the first letter in
and

    and print them on a single line, separated by a space.

Input Format

The first line contains a string
. The second line contains another string

. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of
and .
For the second line, write Yes if is lexicographically greater than otherwise print No instead.
For the third line, capitalize the first letter in both and and print them on a single line, separated by a space.
 */
public class LexicographicalGreaterThan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        A = toUpperCase(A);
        B = toUpperCase(B);
        System.out.println(lexicographicallyGreater(A, B));
        System.out.println(A + " " + B);

    }

    private static String toUpperCase(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }

    private static String lexicographicallyGreater(String firstWord, String secondWord) {
        return firstWord.compareTo(secondWord) > 0 ? "Yes" : "No";
    }

}
