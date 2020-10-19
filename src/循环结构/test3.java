package 循环结构;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
      /*  //老师每天检查张浩的学习任务是否合格，如果不合格则继续进行
        String answer;//声明变量是否合格
        Scanner input = new Scanner(System.in);
        System.out.println("学习合格了吗？(y/n)");
        answer = input.next();
        while(!"y".equals(answer)) {
            System.out.println("上午阅读教材，学习理论部分");
            System.out.println("下午上机编程");
            System.out.println("学习合格了吗？(y/n)");
            answer = input.next();
        }
        System.out.println("完成了学习任务！");*/
        String answer;
        Scanner input=new Scanner(System.in);
        System.out.println("学习合格了吗？(y/n)");
        answer = input.next();

        while(!"y".equals(answer)){
            System.out.println("上午阅读教材，学习理论部分");
            System.out.println("下午上机编程");
            System.out.println("学习合格了吗？(y/n)");
            answer = input.next();
        }
        System.out.println("完成了学习任务");
    }


}
