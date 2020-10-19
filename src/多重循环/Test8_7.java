package 多重循环;

import java.util.Scanner;

public class Test8_7 {
    public static void main(String[] args){
        //编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个字符：");
        char letter=input.next().charAt(0);
        if(letter>=97&&letter<=122){
            System.out.println("你输入的是小写字母："+letter);
            letter=(char)(letter-32);
            System.out.println("该字母的大写字母是："+letter);
        }else {
            System.out.println("该字母的大写字母是：");
        }
    }
}
