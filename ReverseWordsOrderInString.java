//Input: s = "the sky is blue"
 //Output: "blue is sky the" O(N) for both

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseWordsOrderInString {
    public static String reverseOrder(String s){
    //remove leading spaces
    s= s.trim();
    List<String> ls = Arrays.asList(s.split("\\s+"));
        Collections.reverse(ls);
        System.out.print(String.join(" ",ls));
        return String.join(" ",ls);
    }
        //using String Builder
        public static String useBuilder(String st){
            String [] res= st.trim().split(" ");
            StringBuilder result = new StringBuilder();
            for (int i=res.length-1;i>=0;i--){
                if(!res[i].isEmpty()){
                    result.append(res[i]).append(" ");
                }
            }
            System.out.print("third solution   " + result.toString().trim());
            return result.toString().trim();
        }

    public static String reverseOrderTwo(String s) {
        //reverse entire string
        int len = s.length();
        char[] ch = s.toCharArray();
        char temp;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println("first reversed entire string : " + new String(ch));
//______________________________________
        //now reverse each word
        int currentIndex = 0;
        int lastSpace = -1;
        int startIndex = 0;
        int endIndex;
        for (currentIndex = 0; currentIndex <= len; currentIndex++) {
            if (currentIndex == len || ch[currentIndex] == ' ') {
                startIndex = lastSpace + 1;
                endIndex = currentIndex - 1;
                while (startIndex < endIndex) {
                    char te = ch[startIndex];
                    ch[startIndex] = ch[endIndex];
                    ch[endIndex] = te;
                    startIndex++;
                    endIndex--;
                }
                lastSpace = currentIndex;
            }
        }
        System.out.println("Reversing each word : " + new String(ch));
        return new String(ch);
    }


    public static void main(String[] args){
        String s = "the sky is blue";
//        reverseOrder(s);
//        reverseOrderTwo(s);
            useBuilder(s);
    }
}
