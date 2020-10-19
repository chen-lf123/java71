package 数组;
//杨辉三角等腰三角形
public class Test21_1 {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];
        for(int i=0;i< arr.length;i++){
            arr[i][0]=1;//控制第一列的数字等于1
        }
        for(int i=1;i< arr.length;i++){
            for(int j=1;j< arr.length;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];//赋值
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int k= arr.length-i;k>0;k--){//空格的控制为了好看
                System.out.print("  ");
            }
            for(int j=0;j< arr.length;j++){//打印出数组的数字
                if(arr[i][j] !=0){
                    System.out.print(arr[i][j]+"   ");
                }
            }
            System.out.println();//控制换行
        }
    }
}

