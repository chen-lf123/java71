package 多重循环;
//等腰三角形
public class test5_3 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){

            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){//输出每行里的*2*i-1
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
