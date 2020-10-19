package com.company;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.println("请输入您的Java成绩");
        int Jscore= input.nextInt();
        System.out.println("请输入你的音乐成绩");
        int Yscore= input.nextInt();
        *//*  if(条件表达）{
            执行代码块
            }
         *//*
        if((Jscore>90 && Yscore>80)||(Jscore==100 && Yscore>70) ){
            System.out.println("老师就奖励放假8天");
        }*/

    Scanner input=new Scanner(System.in);
    System.out.println("请输入你的心跳值");
    int heartBeats= input.nextInt();

    if(heartBeats < 65 || heartBeats>100) {
        System.out.println("你需要去医院进行检查");
    }else{
        System.out.println("你的心跳正常");
    }

    }
}
