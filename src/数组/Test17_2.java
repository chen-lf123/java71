package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class Test17_2 {
    public static void main(String[] args){
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的名字：");
        String name=input.next();
        int j=-1;
        for(int i=0;i< names.length;i++){
            if(name.equalsIgnoreCase(names[i])){
                j=i;
                break;
            }
        }
        System.out.println("j="+j);
        if(j!=-1){
            for(int i=j;i< names.length-1;i++){
                names[i]=names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1]=null;
        }else{
            System.out.println("很抱歉，没有你要删除的名字！");
        }
        System.out.println("删除后的人员姓名是：");

        for(int i=0;i< names.length-1;i++){
            System.out.print(names[i]+"\t");
        }
    }
}
//for(String item:names){
//            System.out.println(item+"\t");
//        }
//        System.out.println();