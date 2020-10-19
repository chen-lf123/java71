package 循环结构;

public class test8 {
    public static void main(String[] args) {
        int sum=0;
        int num=1;
        while(num<=100) {
            sum=sum+num;//等同于sum+=num
            num++;
        }
        System.out.println("1-100数字累加计算的和是：\n"+sum);
    }
}
