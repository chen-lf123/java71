package 数组;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数：");
        int n= input.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i< arr.length;i++){
            arr[i][0]=1;
            arr[i][i]=1;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<=i-1;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        input.close();

    }
}
