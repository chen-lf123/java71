package 数组;

import java.util.Arrays;
import java.util.Scanner;
public class Test14 {
    public static void main(String[] args){
        //数组删除
        String[] names={"Tome","Jack","Sam","Alice","Ruby","Robin"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的姓名：");
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
            System.out.println("很抱歉，没有您要删除的名字！");
        }
        System.out.println("删除后的人员姓名是：");
        for(String item:names){
            System.out.print(item+"\t");
        }
        System.out.println();
        /*for(int i=0;i< names.length-1;i++){
            System.out.print(names[i]+"\t");
        }*/
    }
}
