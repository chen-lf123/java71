package com.company;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个月份，我能告诉你它属于哪个季节。");
        int month= input.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.print("您输入的月份属于冬季。");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("您输入的月份属于春季。");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("您输入的月份属于夏季。");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("您输入的月份属于秋季。");
                break;
            default:
                System.out.print("你输入的不是正确的月份。");
        }
    }
}
