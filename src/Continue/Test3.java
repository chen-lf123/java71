package Continue;

public class Test3 {
    //求1-10之间的所有偶数和
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                continue;
            }
            sum += i;
        }
        System.out.println("1-10之间的偶数和："+sum);
    }
}
