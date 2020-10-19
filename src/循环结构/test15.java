package 循环结构;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        //要求用户输入一个0到2之间的整数， * 如果用户输入0输出“你出的是石头”，
        // * 如果用户输入1就输出“你出的是剪刀”， * 如果用户输入的是2就输出“你出的是布”，
        // * 然后再问是否要继续出拳， * 如果回答“y”就重复以上过程，否则结束程序
        Scanner input= new Scanner(System.in) ;
        System.out.println("输入一个0到2之间的整数：");
        int number = input.nextInt();
        for(int i=0;i<=2;i++);
        if (number>=0&&number<=2) {
            switch (number){
                case 0:
                    System.out.println("你出的是石头");
                    break;
                case 1:
                    System.out.println("你出的是剪刀");
                    break;
                case 2:
                    System.out.println("你出的是布");
                    break;
                default:
                    break;
            }
            System.out.println("然后再问是否继续出拳？(y/n)");
            String choice= input .next();
            if(choice.equals("y")||choice.equals("Y")){

            }else {

            }

        }else {
            System.out.println("请输入一个0到2之间的整数");
        }
    }
}
