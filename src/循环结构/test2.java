package 循环结构;

public class test2 {
    public static void main(String[] args) {
    //用while循环实现100以内的偶数之和 2+4+6+...+100=
     // 声明 变量 赋值2
       /* int sum=0;
        int i=2;

        while(i<=100){
            sum = sum + i;//累加
            i = i+2;
            System.out.println(sum);
        }
        System.out.println("打印100以内的偶数之和："+sum);*/
        int i=2;
        int sum=0;
        while (i<=100) {
            sum=sum+i;
            i=i+2;
            System.out.println(sum);
        }
        System.out.println("打印100以内的偶数之和"+sum);
    }
}
