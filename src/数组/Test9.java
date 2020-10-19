package 数组;

import java.util.Arrays;
//数组倒置序列
public class Test9 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int i=0;
        int j= arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        /*int[] arr={7,1,5,2};
        int i=0;//定义第一个数组元素下标
        int j=arr.length-1;//定义最后一个数组元素下标
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
