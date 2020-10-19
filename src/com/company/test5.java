package com.company;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int score = input.nextInt();
        if(score>90) {
            System.out.println("成绩大于90分，老师奖励你iphone手表");
        }
    }
}
