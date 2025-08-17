package com.vladproduction.stack_structure;

/**
 * Created by vladproduction on 25-Mar-24
 */

public class Stack {

    int data;
    int top1;
    int top2;
    int arr[];
    int n;

    Stack(int size){
        data = 0;
        top1 = -1;
        top2 = size;
        n = size;
        arr = new int[size];

    }

    public void push1(int data){
        if(top1 < top2 - 1){
            arr[++top1] = data;
        }else{
            System.out.println("Stack is full");
        }
    }

    public void push2(int data){
        if(top1 < top2 - 1){
            arr[--top2] = data;
        }else{
            System.out.println("Stack is full");
        }
    }
    public int pop1(){
        if(top1 >= 0){
            int data = arr[top1];
            top1--;
            return data;
        }
        else{
            System.out.println("Stack is empty");
        }
        return 0;
    }

    public int pop2(){
        if(top2 < n){
            int data = arr[top2];
            top2++;
            return data;
        }else{
            System.out.println("Stack is empty");
        }
        return 0;
    }

}
