package com.company;

import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
       // 输入小明成绩，显示所获奖励,成绩==100分，想干啥就啥,成绩>=90,看电视、吃零食,90>成绩>=60，看书，写作业，成绩<60，做家务、洗碗、拖地。
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的考试成绩");
        int score= input.nextInt();

        if(score==100){
            System.out.print("想干啥干啥");
        }else if(score>=90){
            System.out.print("看电视、吃零食");
        }else if(score>=60&&score<90) {
            System.out.print("看书、写作业");
        }else{
            System.out.print("做家务、洗碗、拖地");
        }
    }
}
