package com.company;

import java.util.Scanner;

public class test21 {
    public static void main(String[] args){
        /*声明2个double 类型变量并赋值，判断第一个数大于10.0且第二个数小于20.0，打印两数之和，否则打印两数的乘积*/
        Scanner input =new Scanner(System.in);
        System.out.println("请输入两个数：");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double sum=a+b;
        double product=a*b;

        if(a>10&&b<20){
            System.out.println("打印两数之和："+sum);
        }else{
            System.out.println("打印两数的乘积："+product);
        }

    }
}
