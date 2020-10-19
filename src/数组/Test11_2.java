package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class Test11_2 {
    public static void main(String[] args){
        //输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，
        // 编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)
        String[] shuiguo=new String[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i< shuiguo.length;i++){
            System.out.println("请输入第"+(i+1)+"种水果：");
            shuiguo[i]= input.next();
            System.out.println();
        }
        Arrays.sort(shuiguo);
        System.out.println("这些水果在字典里的先后顺序是：");
        for(int j=0;j< shuiguo.length;j++){
            System.out.println(shuiguo[j]+"\t");
        }
    }
}
