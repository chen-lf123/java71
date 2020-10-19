package com.company;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = input.nextInt();
        String result =(num%2==0)?"偶数":"奇数";
        System.out.println(num+"是"+result);
    }
}
