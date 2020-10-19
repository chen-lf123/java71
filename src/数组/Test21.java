package 数组;

import java.util.Scanner;
//杨辉三角直角三角形
public class Test21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入你要的杨辉三角的行数");
        int n= input.nextInt();
        int[][] arr=new int[n][n];
        //给每一行数组的第一列和最后一列赋值为1
        for (int x=0;x< arr.length;x++){
            arr[x][0]=1;
            arr[x][x]=1;
        }
        //每行每列的数据都是上一行的前一列的数据和这一列数据之和
        for(int x=0;x< arr.length;x++){
            for(int y=1;y<=x-1;y++){//y不能从0开始，因为第一行已经有值了
                arr[x][y]= arr[x-1][y-1]+arr[x-1][y];
            }
        }
        //遍历二维数组，跟九九乘法表一样的遍历方式右上角不变
        for(int x=0;x< arr.length;x++){
            for(int y=0;y<=x;y++){
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
