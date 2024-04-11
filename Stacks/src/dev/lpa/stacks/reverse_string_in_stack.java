package dev.lpa.stacks;

import java.util.Stack;

public class reverse_string_in_stack {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("before reversing = " + str);
        String result = reverseArray(str);
        System.out.println("after reversing = " + result);
    }
    public static String reverseArray(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars){
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
