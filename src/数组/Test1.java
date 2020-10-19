package 数组;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        double[] scores = new double[3];//声明数组类型 分配数组空间
        //int[] s={88,98,78};   边声明边赋值
        //int[] s1=new int[]{100,98,99};  边声明同时边赋值  new int[]{100,98,99}切记不可定义数组长度
        double avg=0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        //传统的for循环方式 为数组赋值
        //使用for循环来遍历数组元素的下标 下标0-->数组长度
        for(int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"位同学的java成绩：");
            scores[i]= input.nextDouble();//动态根据数组下标获取键盘输入的内容
            sum +=scores[i];
        }
        //增强for（foreach)：迭代为
        /*for(double score:scores){//double score=scores[0]，double score=scores[1]
            sum +=score;
        }*/
        avg=sum/3;
        System.out.println("张浩班级的同学的java成绩的平均分是："+avg);
        /*double[] scores = new double[3];
        double avg=0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"位同学的java成绩：");
            scores[1]= input.nextDouble();
            sum +=scores[i];
        }
        avg=sum/3;
        System.out.println("张浩班级的同学的java成绩的平均分是："+avg);*/
    }

}
