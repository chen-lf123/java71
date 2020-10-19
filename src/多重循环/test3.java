package 多重循环;

public class test3 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){

            for (int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }//等腰三角形

    }
}
