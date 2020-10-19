package com.company;

import java.util.Scanner;

public class test20 {
    /*输入三个int型的数据，放入到a,b,c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
            }

            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a>c) {
                temp = a;
                a = c;
                c = a;
            }
                System.out.print(a+"<"+b+"<"+c);

                }
            }






