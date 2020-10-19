package 多重循环;
import java.util.Scanner;
public class Test6_4 {
    //4、从键盘输入一位整数，当输入1~7时，输出“星期一”~“星期日”
    //输入其他数字时，提示用户重新输入
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=7;i++) {
            System.out.print("请输入一位 1~7 整数,0退出：");
            int num=sc.nextInt();
            if (num==0) break;

            if (num<0 || num>7) {
                System.out.println("无效输入，请重新输入!");
                continue;
            }
            String day = (num==1?"星期一":(num==2?"星期二":(num==3?"星期三":(num==4?"星期四":(num==5?"星期五":(num==6?"星期六":"星期七"))))));
            System.out.println(day);
        }
    }
       /* Scanner input=new Scanner(System.in);
        System.out.print("请输入一位1~7中的整数：");
        int num= input.nextInt();
        if(num==0){

        }else if(num<0||num>7){
            System.out.println("无效输入，请重新输入！");


        }
        System.out.println("星期" + days[num - 1]);
*/
    }

