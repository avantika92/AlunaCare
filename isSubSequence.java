/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by
deleting some (can be none) of the characters without disturbing the relative positions
of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not
 */

public class isSubSequence {
    public static Boolean isSubString(String s, String t){
        int slength= s.length();
        int tlength = t.length();
        int leftIndex=0, rightindex=0;
        while(leftIndex<slength && rightindex<tlength){
            if(s.charAt(leftIndex)==t.charAt(rightindex)){
                leftIndex++;
            }
            rightindex++;
        }
        return leftIndex==slength;

    }
}
