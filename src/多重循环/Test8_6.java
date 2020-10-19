package 多重循环;

import java.util.Scanner;

public class Test8_6 {
    public static void main(String[] args){
        //手动输入一个整型会员号，如果用户输入的是4位数字，输出登录成功，
        //如果用户输入的不是4位数字,输出“您输入的会员号有误
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整型会员号：");
        int num= input.nextInt();

        int i=0;//初始化数字的位数
        while(num!=0){
            num=num/10;//被10整除
            i++;
        }
        if(i!=4){
            System.out.println("您输入的会员号有误：");
        }else{
            System.out.println("登录成功！");
        }
    }
}
