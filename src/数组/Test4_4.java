package 数组;

import java.util.Scanner;

public class Test4_4 {
    public static void main(String[] args){
        //数组查找操作：定义一个长度为10 的一维字符串数组，
        // 在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
        // 程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”
        String[] list=new String[10];
        list[0]="hello";
        list[1]="world";
        list[2]="good";
        list[3]="study";
        list[4]="day";
        list[5]="up";
        list[6]="love";
        list[7]="apple";
        list[8]="stop";
        list[9]="car";
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个单词:");
        String word=input.next();

        boolean flag=false;
        for (int i = 0; i < list.length; i++) {
            if(word.equals(list[i])){
                flag=true;
                break; //找到就跳出
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

     /*   System.out.println("请输入一个单词：");
        String list= input.next();

        boolean flag=false;
        for(String num:list){
            if(num == word){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("数组包含这个单词：Yes");
        }else{
            System.out.println("数组不包含这个单词：No");
        }*/
    }
}
