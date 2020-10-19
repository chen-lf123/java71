package 数组;

import java.util.Scanner;
//二维数组
public class Test19 {
    public static void main(String[] args){
        //5个班个5 名同学某门成绩，如何计算5 个班的各自成绩
        int[][] scores=new int[3][5];
        Scanner input=new Scanner(System.in);
        //外层循环  班级     （内层循环    班级的学生）
        for(int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"个班");
            for(int j=0;j<scores.length;j++){
                System.out.println("请输入第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
                scores[i][j]= input.nextInt();
            }
        }//完成5 个班级同学的成绩统计
        System.out.println("统计考试成绩：");
        for(int i=0;i<scores.length;i++){
            int sum=0;
            for(int j=0;j<scores[i].length;j++){
                sum +=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的同学的总成绩是："+sum);
        }
    }
}

