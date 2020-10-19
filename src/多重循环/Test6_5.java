package 多重循环;
import java.util.Scanner;
public class Test6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您需要的几行数字：");
        int line = input.nextInt();
                                                             //        循环行数
        for (int i = 0; i < line; i++) {
                                                               //            每行的空格数规律为输入行数-1
            for (int j = 0; j < line - i - 1; j++) {
                System.out.print(" ");
            }
                                                                   //            每行输出的个数为等差数列，规律为2*当前行-1
                                                                              //            输出内容为当前行
            for (int z = 0; z < 2 * i + 1; z++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
