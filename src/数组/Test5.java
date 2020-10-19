package 数组;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        int[] list=new int[]{8,4,2,1,23,344,12};
        Scanner input=new Scanner(System.in);
        int guess= input.nextInt();
        boolean flag=false;
        for(int num:list){
            if(num==guess){
            flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("恭喜你这个数包含在此数列中");
        }else{
            System.out.println("抱歉这个数不在此数列中");
        }
    }
}
