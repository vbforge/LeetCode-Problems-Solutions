package com.vladproduction.stack_structure;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack(11);
        st.push1(5);
        st.push2(15);
        st.push2(93);
        st.push2(15);
        st.push1(28);
        st.push1(37);
        st.push1(9);
        st.push2(44);
        System.out.println("Popped element from stack1 is "+st.pop1());
        System.out.println("Popped element from stack2 is "+st.pop2());

    }
}
