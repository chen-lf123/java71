package 数组;

import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args){
        // 数组存储5笔购物金额，在控制台输出并计算总金额
        double[] money=new double[5];
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入本月会员的消费记录：");
        for(int i=0;i< money.length;i++){
            System.out.println("请输入第"+(i+1)+"笔消费金额：");
            money[i]= input.nextDouble();
            sum =sum+money[i];
        }
        System.out.println("序号\t\t\t\t金额（元）");
        for(int i=0;i< money.length;i++) {
            System.out.println(+(i + 1) + "\t\t\t\t" + money[i]);
        }
        System.out.println("总金额：\t\t\t"+sum);
    }
}
