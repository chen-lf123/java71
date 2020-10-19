package 数组;

import java.util.Scanner;

public class Test20_1 {
    //使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
    public static void main(String[] args) {
        int[][] scores=new int[5][3];
        Scanner input=new Scanner(System.in);
        for(int i=0;i< scores.length;i++){
            System.out.println("请输入第"+(i+1)+"名同学的成绩:");
            for(int j=0;j< scores.length-2;j++){
                System.out.println("请输入第"+(i+1)+"名同学的第"+(j+1)+"门成绩：");
                scores[i][j]= input.nextInt();
            }
        }
        System.out.println("统计考试成绩：");

        for(int i=0;i<scores.length;i++){
            double sum=0;
            double  avg=0;
            int max=scores[i][0];
            int min=scores[i][0];
            for(int j=0;j<scores.length-2;j++){
                if(scores[i][j]>max){
                    max=scores[i][j];
                }
                if(scores[i][j]<min){
                    min=scores[i][j];
                }
                sum +=scores[i][j];
                avg =sum/3;
            }
            System.out.println("第"+(i+1)+"名同学的总分为："+sum+"\t平均分为："+avg);
            System.out.println("第"+(i+1)+"位同学的最高分为max："+max);
            System.out.println("第"+(i+1)+"位同学的最低分为min："+min);
        }
        /*for(int i=0;i< scores.length;i++){
            int max=scores[i][0];
            for(int j=0;j< scores[i].length;j++){
                if(scores[i][j]>max){
                    scores[i][j]=max;
                }
            }*/



    }
}
