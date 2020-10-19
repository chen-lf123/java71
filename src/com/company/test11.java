package com.company;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
       /* Scanner input=new Scanner(System.in);
        System.out.println("请输入你的考试成绩");
        int score=input.nextInt();
        if(score>90) {
            System.out.print("优秀");
        }else if(score>80){
            System.out.print("良好");
        }else if(score>=60){
            System.out.print("合格");
        }else{
            System.out.print("差");
        }*/
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age= input.nextInt();

        if(age<0) {
            System.out.print("你输入的年龄不正确，请重新输入");
        }else if(age<18) {
            System.out.print("青少年时期：");
        }else if(age < 35) {
            System.out.print("青壮年时期");
        }else if(age<60){
            System.out.print("中年时期");
        }else if(age<100) {
            System.out.print("老年时期");
        }else{
            System.out.print("恭喜你成仙了");
        }
    }
}
