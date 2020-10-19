package com.company;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int cardNO;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");

        cardNO = input.nextInt();

        int gewei = cardNO%10;
        int shiwei = cardNO/10%10;
        int baiwei = cardNO/100%10;
        int qianwei = cardNO/1000;

        int sum = gewei+shiwei+baiwei+qianwei;
        System.out.println("会员卡号："+cardNO+"各位之和："+sum);
        boolean isluck = sum>20;
        System.out.println("你是幸运用户吗?"+isluck);

    }
}
