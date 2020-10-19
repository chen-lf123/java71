package com.company;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
       /* Scanner input= new Scanner(System.in);
        System.out.print("请输入你的考试成绩");
        int score= input.nextInt();

        if(score==100){
            System.out.print("奖励BMW");
        }else if(score>=80&&score<=99){
            System.out.print("奖励Iphone12");
        }else if(score>=60&&score<80) {
            System.out.print("奖励iPad");
        }else{
            System.out.print("什么都没有");
        }*/
        int a;
        int b;
        int c;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入a:");
        a= input.nextInt();
        System.out.print("请输入b:");
        b= input.nextInt();
        System.out.print("请输入c:");
        c= input.nextInt();

        if(a>b&&a>c){
            System.out.print("三个数中最大的是a:"+a);
        }else if(b>c){
            System.out.print("三个数中最大的是b："+b);
        }else{
            System.out.print("三个数中最大的是c："+c);
        }
    }
}

