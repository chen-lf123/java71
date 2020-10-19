package 数组;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        //有一组学员的成绩{99,85,82，63,60}
        //要增加一个学员的成绩，将它插入成绩序列，并保持降序
        int[] list=new int[6];
        list[0]=99;
        list[1]=85;
        list[2]=82;
        list[3]=63;
        list[4]=60;

        Scanner input=new Scanner(System.in);
        System.out.print("请输入你要插入学生的成绩：");
        int num= input.nextInt();
        //找到num 要插入的位置index 找到num比数组中元素大的位置
        int index=list.length-1;
        for(int i=0;i< list.length;i++){
            if(num>list[i]){
                index=i;
                break;
            }
        }
        //原index位置及以后的所有数据要整体后移
        for(int i= list.length-1;i>index;i--){
            list[i]=list[i-1];
        }
        //在index位置将num插入进去
        list[index]=num;
        System.out.println("插入成绩的下标是："+index);
        System.out.println("插入新的成绩最后的成绩是：");
        for(int listnum:list){
            System.out.println(listnum+"\t");
        }
      /*  int[] list=new int[6];
        list[0]=99;
        list[1]=85;
        list[2]=82;
        list[3]=63;
        list[4]=60;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num= input.nextInt();*/
    }
}
