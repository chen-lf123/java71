package 多重循环;

public class test2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=1; j<=5;j++){
                System.out.print("*");
            }

            System.out.println();
        }//平行四边形
    }
}
