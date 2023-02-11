/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class validPalindrome {
    public static boolean isValidPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j =s.length()-1;
        while (i<=j) {
            if (s.charAt(i) != s.charAt(j) ) {
                System.out.println("not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
        return true;
    }
    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        isValidPalindrome(s);
    }
}
