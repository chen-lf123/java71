package com.company;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的考试成绩");
        int score=input.nextInt();
        /*if(表达式）{
        执行代码块1
        }else{
        执行代码块2
        }
         */

        if(score>90){
            System.out.println("奖励你一个小天才电话手表");
        }else{
            System.out.println("回家继续写作业");
        }
    }
}
