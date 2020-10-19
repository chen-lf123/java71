package 多重循环;

import java.util.Scanner;

public class Test8_4 {
    public static void main(String[] args){
        //商场消费返利活动，手动输入顾客消费金额，
        //如果金额打8折后仍然满1000元，用户就获得200元代金券一张
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的消费金额：");
        int consumption=input.nextInt();

        double dis=consumption*0.8;

        if(dis>1000){
            dis=dis-200;
            System.out.println("恭喜你获得一张200元的代金券");
        }
        System.out.println(dis);
    }
}
