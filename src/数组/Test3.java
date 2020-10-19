package 数组;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        //从键盘输入本次java考试五为学生的成绩，求考试最高分
        int[] scores = new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"位同学的java成绩：");
            scores[i] = input.nextInt();
        }
        int max =scores[0];
        for(int i=1;i<scores.length;i++){
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("此次考试中java成绩最高分为："+max);
    }
}
