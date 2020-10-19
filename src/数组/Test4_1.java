package 数组;

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args){
        //求出4家店的最低手机价格
        int[] price=new int[4];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入4家店的价格：");
        for(int i=0;i<price.length;i++){
            System.out.println("请输入第"+(i+1)+"家手机的价格：");
            price[i]=input.nextInt();
        }
        int min=price[0];
        for(int i=1;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            }
        }
        System.out.println("最低的价格是："+min);
    }
}
