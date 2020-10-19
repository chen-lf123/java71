package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class  Test11_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char[] chars={'a','c','u','b','e','p','f','z'};
        System.out.println("排序前，打印数组："+Arrays.toString(chars));
        char temp=0;
        Arrays.sort(chars);
        System.out.println("排序后，打印数组"+Arrays.toString(chars));

        for(int i=0;i< chars.length;i++){
            for(int j=0;j<chars.length-i-1;j++){
                if(chars[j]>chars[j+1]){
                    temp=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=temp;
                }
            }
        }
        int index=Arrays.binarySearch(chars,'e');
        System.out.println("'e'在升序后数组中的位置是："+index);
       /* System.out.println("------Arrays.sort(chars) 方法------");
        char[] chars={'a','c','u','b','e','p','f','z'};
        Arrays.sort(chars);
        for(int i=0;i< chars.length;i++){
            System.out.println(chars[i]+"");
        }
        System.out.println(chars);

        Arrays.sort(chars);
        int index=Arrays.binarySearch(chars,'u');
        System.out.println("下标为："+index);*/
    }
}
