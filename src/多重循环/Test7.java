package 多重循环;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        int score=0;
        double avg=0;
        int sum=0;
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("请输入第"+i+"位同学的java成绩：");
            score = input.nextInt();
            sum +=score;
        }
        avg = (double)sum/3;
        System.out.println("全班同学java成绩的平均分为："+avg);



    }
}
