package 数组;

import java.util.Scanner;

public class Test17_3 {
    public static void main(String[] args){
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要修改的数据");
        String name=input.next();

        int j=-1;
        for(int i=0;i< names.length;i++){
            if(names[i].equals("sam")){
                j=i;
                break;
            }
        }
       System.out.println("j="+j);
        if(j!=-1){
            names[j]="sandy";
        }else{
            System.out.print("数组不存在Sam");
        }
        System.out.println("修改后的数据为：");
        for(String item:names){
            System.out.print(item+"\t");
        }
    }
}
