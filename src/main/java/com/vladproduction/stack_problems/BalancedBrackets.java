package com.vladproduction.stack_problems;

import java.util.Stack;

/**

 Balanced Brackets

 1. You are given a string exp representing an expression.
 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

 e.g.
 [(a + b) + {(c + d) * (e / f)}] -> true
 [(a + b) + {(c + d) * (e / f)]} -> false
 [(a + b) + {(c + d) * (e / f)} -> false
 ([(a + b) + {(c + d) * (e / f)}] -> false

 */
public class BalancedBrackets {
    public static void main(String[] args) {

        String str1 = "[(a + b) + {(c + d) * (e / f)}]";
        String str2 = "[(a + b) + {(c + d) * (e / f)]}";
        String str3 = "[(a + b) + {(c + d) * (e / f)}";
        String str4 = "([(a + b) + {(c + d) * (e / f)}]";

        check(str1);
        check(str2);
        check(str3);
        check(str4);

    }

    private static void check(String expression){

        Stack<Character> st = new Stack<>();

        for(char ch : expression.toCharArray()) {
            if(ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }
            else if(ch == ']') {
                if(!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
            else if(ch == '}') {
                if(!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
            else if(ch == ')') {
                if(!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(st.isEmpty());
    }

}
