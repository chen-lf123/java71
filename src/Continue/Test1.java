package Continue;

import java.util.Scanner;

public class Test1 {
    //循环录入java课的学生成绩，统计全班人数大于等于80分的学生比例
    public static void main(String[] args){
        int score;//成绩
        int total;//班级总人数
        int num=0;//成绩大于80分的人数
        Scanner input=new Scanner(System.in);
        System.out.println("请输入班级的总人数：");
        total = input.nextInt();
        for(int i=0;i<total;i++){
            System.out.println("请输入第"+(i+1)+"位学生的成绩：");
            score = input.nextInt();
            if(score<80){
                continue;

            }
            num++;
        }
        System.out.println("成绩大于80分的学生人数是："+num);
        double rate =(double) num/total*100;
        System.out.println("80分以上的学生所占的比例为："+rate+"%");
    }
}
