package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args){
        String[] names={"Tome","Jack","Sam","Alice","Ruby","Robin"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入查找的关键字");
        String keyword= input.next();
        String[] tempNames=new String[0];
        int j=0;
        for(int i=0;i< names.length;i++){
            if(names[i].toLowerCase().contains(keyword.toLowerCase())) {
                tempNames= Arrays.copyOf(tempNames,tempNames.length+1);
                tempNames[j++]=names[i];
            }
        }
        System.out.println("根据你输入的"+keyword+"关键字，查询的结果入下：");
        if(tempNames.length==0){
            System.out.println("没有查询到满足条件的名字。");
        }else{
            for(String name:tempNames){
                System.out.println(name);
            }
        }
    }
}
