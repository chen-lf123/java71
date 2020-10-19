package 多重循环;

public class test5_4 {
    public static void main(String[] args) {
        int n= 0 ;
        System.out.println("      *");
        for(int i=0;i<=10;i++){
            n++;
            if (i<=5) {
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < n*2-1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }else {
                for(int l =5;l<i;l++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int m = 20; m>i*2-1;m--){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();//换行！！！
        }
        System.out.println("      *");







      /*  for (int i=1;i<=5;i++) {                 // 打印上半部分空格
            for (int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }                                     // 打印原本实心的*部分
            for (int j=1;j<=2*i-1;j++) {               // 仅在一行的开头和末尾打印*
                if (j==1||j==2*i-1) {
                    System.out.print("*");                    //如果处于开头则打印*，否则打印
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i=4;i>=1;i--) {                          // 打印下半部分空格
            for (int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }                                                  // 打印原本实心的*部分
            for (int j=1;j<=2*i-1;j++) {                   // 仅在一行的开头和末尾打印*
                if (j==1||j ==2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}






