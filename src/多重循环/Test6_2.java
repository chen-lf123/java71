package 多重循环;

public class Test6_2 {
    //2、判断1-100之间有多少个质数并输出所有质数
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            int j=2;
            for( j=2;j<=100;j++){
                if(i%j==0){
                    break;
                }

            }
            if(i==j){
                System.out.print(i+"\t");
                count++;
                if(count%8==0){
                    System.out.println();
                }

            }
        }
    }
}
