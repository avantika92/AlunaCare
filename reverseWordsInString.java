//Input: s = "God Ding"
//Output: "doG gniD"

public class reverseWordsInString {
    public static String reverseWordsInString(String s) {
        char[] result = s.toCharArray();
        int lastSpace = -1;
        for (int currentIndex = 0; currentIndex <= s.length(); currentIndex++) {
            if(currentIndex==s.length() || result[currentIndex]==' '){
            int startIndex = lastSpace + 1;
            int endIndex = currentIndex - 1;
            while (startIndex < endIndex) {
                char temp = result[startIndex];
                result[startIndex] = result[endIndex];
                result[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
            lastSpace = currentIndex;
        }
    }
        System.out.println(new String(result));
        return new String(result);
    }
    public static void main(String [] args){
        String s = "The sky is Blue";
        reverseWordsInString(s);
    }
}
