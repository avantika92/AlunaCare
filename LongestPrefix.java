import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string Input: strs = ["flower","flow","flight"]
//Output: "fl"
public class LongestPrefix {
    public static String longestPrefix(String [] stars){
        if (stars.length ==0){
            return "";
        }
        //we take the first index to be the prefix string ;
        String prefix = stars[0];
        //then we used or loop for iterating
        //and changing prefix as we go further in the string ;
        for (int i=1;i<stars.length;i++) {
            String str = stars[i];
            while(str.indexOf(prefix) != 0){
                prefix =prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);
        return prefix;
    }
    public static void main(String[] args){
    String [] stars = new String[]{"flow","flodkjsd","flo"};
    longestPrefix(stars);
}
}


