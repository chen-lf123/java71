package 循环结构;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args){
        //从键盘上接收一批整数，比较并输出其中的最大值和最小值，输入数字0时结束循环
        int max=0;
        int min=0;
        int sum=0;
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数（输入0结束）：");
            int i= input.nextInt();
            if(sum==0){
                max=i;
                min=i;
                sum++;
            }
            if(i==0){
                break;
            }
            if(max<i) {
                max=i;
                sum++;
            }
            if(min>i) {
                min=i;
                sum++;
            }
        }
        if(max!=0&&sum!=1) {
            System.out.println("最大："+max);
            System.out.println("最小："+min);
        }else {
            System.out.println("你只输入了一次无法比较");
        }
    }
}
