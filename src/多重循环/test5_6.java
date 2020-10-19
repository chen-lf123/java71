package 多重循环;

public class test5_6 {
    public static void main(String[] args){
        int num = 0;
        int sum = 0;
        System.out.println("1-100之间的不能被7整除的数是：");
        for(int i = 1;i<=100;i++){
            if(i%7!=0){
                System.out.print(i+"\t");
                num++;
                sum = sum+i;
                if(num == 4){
                    System.out.println();
                    num=0;
                }
            }
        }
        System.out.println("\n1-100之间不能被7整除的数的和是： "+sum);
    }
}
