package 多重循环;

import java.util.Scanner;

public class Test8_2 {
    public static void main(String[] args){
        //商场举行店庆，抽几折打几折，先手动输入消费金额，再输入，抽到的折扣，计算出折后价格
        double consumption;
        double discount;
        Scanner input=new Scanner(System.in);
        System.out.println("先输入消费金额：");
        consumption= input.nextDouble();
        System.out.println("请输入您抽到的折扣：");
        discount= input.nextDouble();
        consumption=discount/10*consumption;
        System.out.println("您的折后价格为："+consumption);
    }
}
