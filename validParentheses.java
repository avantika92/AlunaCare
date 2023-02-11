/*If the character is an opening bracket ( '(', '{', or '[' ), it pushes it onto the stack.
If the character is a closing bracket ( ')', '}', or ']' ), it checks if the stack is empty.
If it is, it immediately returns false, as there is no corresponding opening bracket.
Otherwise, it checks if the top element of the stack matches the closing bracket
(i.e. '(' matches ')', '{' matches '}', '[' matches ']').
If there is a match, it pops the top element from the stack.
If there is no match, it immediately returns false*/
// T O(N) , S O(N)

import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s){
        Stack<Character> bracket = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                bracket.push(ch);
            }
            else {
                if (bracket.empty()) {
                    System.out.println("invalid string");
                    return false;
                }
                if ((bracket.peek() == '(' && ch == ')')
                        || (bracket.peek() == '{' && ch == '}')
                        || (bracket.peek() == '[' && ch == ']')){
                    bracket.pop();
            }
            else{
                return false;
            }
            }
        }
        if (bracket.isEmpty()){
            System.out.println("valid string");
            return true;
        }
        else {
            System.out.println("invalid string");
            return false;
        }
    }
    public static void main(String[] args){
        validParentheses vr = new validParentheses();
        vr.isValid(")");
    }
}
