package 多重循环;

public class test8_11 {
    public static void main(String[] args){
      /*  double money=1;
        int day=1;
        while(money<10){
            money=money*1.5;
            day++;
            System.out.println("第"+day+"天存钱会超过"+money+"元");
        }
        System.out.println(day);*/

       //有一个有钱的神经病，他往银行里存钱，第一天存1元,以后每天比前一天多存50%，完成下列计算任务
        //（1)他存到第几天，当天存的钱会超过10元.（2)一个月（30天）后，他总共存了多少钱
        double monye=1;
        double sum=0;
        for(int i=1;i<=30;i++){
        sum=sum+monye;
            System.out.println("第"+i+"天：存钱："+monye+",总计："+sum);
            monye=monye*1.5;
        }
            System.out.println(sum);

    }
}
