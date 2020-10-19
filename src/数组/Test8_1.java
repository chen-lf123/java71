package 数组;

import java.util.Scanner;

public class Test8_1 {
    public static void main(String[] args){
        //使用冒泡排序对输入的5名学员成绩进行降序排列
        int[] scores=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入5名学员的成绩：");
        for(int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"位同学的成绩：");
            scores[i]= input.nextInt();
        }
        for(int i=0;i<scores.length-1;i++){
            for(int j=0;j<scores.length-1-i;j++){
                if(scores[j]<scores[j+1]){
                    int temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                }
            }
        }
            System.out.println("学员的成绩按降序排列：");
        for(int l:scores){
            System.out.print(l+"\t");
        }
    }
}
