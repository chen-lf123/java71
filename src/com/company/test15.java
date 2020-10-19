package com.company;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        //请根据英文单词的第一个字母判断星期几，如果第一个字母一样，则继续判断第二个字母。
        // 例如：如果第一个字母S，则继续判读第二个字母，如果第二个字母是a,则输出“星期六”
        Scanner input=new Scanner(System.in);
        System.out.print("请输入第一个字母：");
        String first= input.next();
        char i=first.charAt(0);
        switch (i){
            case 'M': System.out.print("星期一"); break;
            case 'W': System.out.print("星期三"); break;
            case 'F': System.out.print("星期五"); break;

            case 'T': System.out.print("请输入第二个字母：");
                String second = input.next();
                char j=second.charAt(0);
                if(j=='u'){
                    System.out.print("星期二");
                }else if(j=='h'){
                    System.out.print("星期四");
                }else{
                    System.out.print("请输入有效字母");
                }
                break;

            case 'S':System.out.print("请输入第二个字母：");
                String second2 = input.next();
                char z=second2.charAt(0);
                if(z=='a'){
                    System.out.print("星期六");
                }else if(z=='u'){
                    System.out.print("星期天");
                }else{
                    System.out.print("请输入有效字母");
                }
                break;
            default:
                System.out.print("请输入有效字母！");
                break;
        }
    }
}
