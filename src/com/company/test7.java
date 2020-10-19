package com.company;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = input.nextInt();

        int num1 = num / 1000 % 10;
        int num2 = num / 100 % 10;
        int num3 = num / 10 % 10;
        int num4 = num % 10;
        int a = num4 * 1000 + num3 * 100 + num2 * 10 + num1;
        System.out.println(a+num);
    }

}
