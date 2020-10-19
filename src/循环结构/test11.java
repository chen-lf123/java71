package 循环结构;

public class test11 {
    //本金10000元存入银行，年利率是千分之三。每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少
    public static void main(String[] args) {
       double money=10000;

       for(int i=1;i<=5;i++) {
           money = money*1.003;
       }
       System.out.println("五年后的本金是："+money);
    }

}
