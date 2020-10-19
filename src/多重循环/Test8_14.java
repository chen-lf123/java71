package 多重循环;

public class Test8_14 {
    public static void main(String[] args){
        //编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
        //一钱三只，现有百钱欲买百鸡，共有多少种买法？
        int count=0;
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){

                if ((i*5+j*3+(100-i-j)/3)==100) {
                    System.out.println("公鸡个数：" + i);
                    System.out.println("母鸡个数：" + j);
                    System.out.println("小鸡个数：" + (100 - i - j));
                    count++;
                    }
                }
        }
        System.out.println("总共有"+count+"种买法");

    }
}
