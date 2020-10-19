package 循环结构;

public class test13 {
    public static void main(String[] args) {
        //使用for循环输出100~1000之间所有水仙花数。
        //所谓水仙花数就是一个三位数，它各位的立方之和加起来的数值等于本身，
        //比如说，153,   153 = 1 + 125 + 27
        int a,g,s,b;
        for(a=100;a<=1000;a++){
            g=a%10;
            s=a/10%10;
            b=a/100%10;
            if(a==g*g*g+s*s*s+b*b*b){
                System.out.println(a);
            }
        }
    }
}
