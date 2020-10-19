package 多重循环;

public class Test8_10 {
    public static void main(String[] args){
        //打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
        int sum=0;
        for(int i=1;i<=100;i++){
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                continue;
            }else{
                System.out.println(i);
            }
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
