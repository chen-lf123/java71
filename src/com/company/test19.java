package com.company;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        /*要求用户输入一个整数，判断该数是奇数还是偶数。
        提示：能被2整除的整数为偶数，即该数除以2后余数为0，因此可以采用取余运算判断数的奇偶性*/
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int a= input.nextInt();

        if(a%2==0){
            System.out.print("这个数能被2整除是偶数");
        }else{
            System.out.print("这个数不能被2 整除是奇数");
        }
    }
}
