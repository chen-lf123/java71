package com.company;

import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的月收入：");
        double income= input.nextDouble();



        if(income<=5000){
            System.out.println("您的收入未达到征收点不用交税。");
        }else  if((income-5000)<=3000){
            System.out.println("本月要缴纳的个人所得税为："+(income-5000)*3/100);
        }else if((income-5000)>3000&&(income-5000)<=12000){
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*10/100-210));
        }else  if((income-5000)>12000&&(income-5000)<=25000) {
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*20/100-1410));
        }else if((income-5000)>25000&&(income-5000)<=35000){
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*25/100-2660));
        }else if((income-5000)>35000&&(income-5000)<=55000){
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*30/100-4410));
        }else if((income-5000)>55000&&(income-5000)<=80000) {
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*35/100-7160));
        }else if((income-5000)>80000) {
            System.out.println("本月要缴纳的个人所得税为："+((income-5000)*45/100-15160));
        }
    }
}
