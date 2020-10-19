package 多重循环;

import java.util.Scanner;

public class Test8_3 {
    public static void main(String[] args){
        //手动输入一个4位数，求各位数字之和
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个四为数：");
        int number= input.nextInt();
        int a=number%10;
        int b=number/10%10;
        int c=number/100%10;
        int d=number/1000;
        int sum;
        sum=a+b+c+d;
        System.out.println("这个四位数，各位数字之和为："+sum);
    }
}
