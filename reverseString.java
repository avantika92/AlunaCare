//hello-- olleh

public class reverseString {
    public static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        char temp;
        while (left < right) {
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String st = new String(ch);
        System.out.print(st);
        return st;
    }

    public static void main(String[] args) {
        String s = "hello";
        reverseString(s);
    }
}
