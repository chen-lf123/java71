package 多重循环;

import java.util.Scanner;

public class Test8_1 {
    //手动输入一个学生的成绩，对这个成绩进行一次加分，加当前成绩的20%，输出加分后成绩
    public static void main(String[] args){
        double score;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入该名学生的成绩：");
        score= input.nextDouble();

        score =score*1.2;
        System.out.println("该学生加入当前20%的成绩为："+score);
    }

}
