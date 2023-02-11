public class subString {
    public static String findSubString(String s, String t){
        int slength = s.length();
        int tlength = t.length();
        int startIndex =0;
        int lastIndex = 0;
        String resultString ="";
        for (int i=0; i<slength;i++){
            for (int j=0; j<tlength;j++){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                    startIndex = s.charAt(i);
                    resultString+=s.charAt(startIndex);
                }
            }
        }
        System.out.print(resultString);
        return resultString;
    }
    public static void main(String [] args){
        String s = "abcnjkk";
        String t = "ck";
        findSubString(s,t);
    }
}
