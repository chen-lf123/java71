package Continue;

public class Test2 {
    public static void main(String[] args){
        //请实现输出1-10中非4的倍数的数字
        for(int i=1;i<=10;i++){
            if(i%4==0){
               continue;
            }
            System.out.println(i+"");
        }
        System.out.println("循环结束");
    }
}
