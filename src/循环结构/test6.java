package 循环结构;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name =input.next();
        for (int i=1;i<=5 ; i++) {
            System.out.println("请输入第"+i+"门课的成绩");
            score = input.nextInt();
            sum=sum+score;
        }
        avg=(double) sum/5;
        System.out.println(name+"的平均分是："+avg);
    }
}
