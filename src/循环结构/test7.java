package 循环结构;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int i,j;
        Scanner input = new Scanner(System.in) ;
        System.out.println("请输入一个整数：");
        int val = input.nextInt();
        System.out.println("根据这个数值可以输入一下加法表：");
        for(i = 0,j =val; i<=val;i++,j--) {
            //for(表达式1；表达式2；表达式3）
            //表达式1（循环变量初始化 i 初始值 0，j初始值是键盘输入获取的值）
            //表达式2（循环条件判断 i<=键盘输入获取的值 val）
            //表达式3（循环更新变量i++ i循环+1，j-- j循环减1）
            System.out.println(i+"+"+j+"="+(i+j));
            //+ 拼接  "+" 输出+的字符
        }

    }
}
