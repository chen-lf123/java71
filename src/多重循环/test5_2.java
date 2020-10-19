package 多重循环;
//平行四边形
public class test5_2 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++) {
            //输出每行里的空格
            for(int k=0;k<=5-i;k++) {
                System.out.print(" ");
            }

            for(int j=0;j<=5;j++){//输出每行里的5列
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
