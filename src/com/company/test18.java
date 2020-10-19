package com.company;

import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入任意两个数字");
        int num1= input.nextInt();
        int num2= input.nextInt();
        System.out.print("请输入+、-、*、/其中一种关系运算符");
        char c=input.next().charAt(0);
        switch (c){
            case '+':
                System.out.print(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.print(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.print(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.print(num1+"/"+num2+"="+(num1/num2));
                break;
            default:
                System.out.print("非法运算符");
        }
    }
}
