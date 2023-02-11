/*Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.*/

public class palindromeLongest {
    public static int longestPalindrome(String s){
        int [] count= new int[128];
        for (char c:s.toCharArray()){
            count[c]++;
        }
        int result= 0;
        for(int i:count){
            result += i/2*2;
            if(result %2 ==0 && i%2==1)
                result++;
        }
        System.out.print(result);
        return result;
    }
    public static void main(String[] args){
        String s= "aasslllpp";
        longestPalindrome(s);
    }
}
