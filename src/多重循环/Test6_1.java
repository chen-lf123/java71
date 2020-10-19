package 多重循环;
import java.util.Scanner;
public class Test6_1 {
 //1、输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分
 public static void main(String[] args){
  int score;
  int total=0;
  double avg=0;
  double max;
  double min;
  Scanner input=new Scanner(System.in);
  for(int i=1;i<=3;i++){
   System.out.println("请输入第"+i+"个班5个学生的成绩：");
   System.out.println("请输入第1位同学的成绩：");
   score= input.nextInt();
   max=score;
   min=score;
   total=score;
   for(int j=1;j<5;j++){
    System.out.println("请输入第"+(j+1)+"位同学的成绩：");
    score= input.nextInt();
    if(score<min){
     min=score;
    }
    if(score>max){
     max=score;
    }
    total+=score;
   }
   avg=(double)total/5;
   System.out.println("总分为："+total);
   System.out.println("平均分为："+avg);
   System.out.println("最高分为："+max);
   System.out.println("最低分为："+min);
  }

 }
}
