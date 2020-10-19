package 多重循环;

public class Test8_12 {
    public static void main(String[] args){
        //井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
        // 计算蜗牛需要多少天才能从井底到爬出来
        int day=1;
        double sum=0;
        while(true){
            sum+=5;
            System.out.println("第"+day+"天爬了"+sum+"米");
            if(sum>56.7){
                break;
            }
            sum-=3.5;
            day++;
        }
        System.out.println("第"+day+"天从井底爬出来");
    }
}
