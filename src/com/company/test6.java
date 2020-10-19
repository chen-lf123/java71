package com.company;


import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int r;
        int h;
        Scanner input= new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        r= input.nextInt();
        System.out.println("请输入圆柱体的高");
        h= input.nextInt();
        double s=r*r*3.14;
        System.out.println("圆的底面积是："+s);
        double v=s*h;
        System.out.println("圆柱体的体积是："+v);

    }
}
