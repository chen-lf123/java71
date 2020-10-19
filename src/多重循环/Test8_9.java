package 多重循环;

import java.util.Scanner;

public class Test8_9 {
    public static void main(String[] args){
        //编写程序，对输入的年、月、日，给出该天是该年的第多少天？
        Scanner input=new Scanner(System.in);
        System.out.println("请输入日期:");
        int dateSum=0;
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();
        for(int i=0;i<month;i++){

            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dateSum+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dateSum+=30;
                    break;
                case 2:
                    if(year%4==0&&year%100!=0||year%400==0){
                        dateSum+=29;
                    }else {
                        dateSum+=28;
                    }
            }
        }
        dateSum+=day;
        System.out.println(+year+"年"+month+"月"+day+"日是当年的第"+dateSum+"天");
    }
}
