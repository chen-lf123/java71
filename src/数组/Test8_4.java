package 数组;

public class Test8_4 {
    public static void main(String[] args){

       /* //向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        //1)统计每个数字出现了多少次
        //2)输出出现次数最多的数字
        //3)输出只出现一次的数字中最小的数字
       int[] nums=new int[10];
       for(int i=0;i< nums.length;i++){
           nums[i]=(int)(10*Math.random());
       }
       System.out.println("数组中的元素有：");
       for(int n:nums){
           System.out.print(n+"\t");
       }
        System.out.println();
        int flag;//这个是出现的次数
        int []b=new int[10];
        for(int i=0;i<nums.length;i++) {
            flag=0;//每次都初始化（置0）数组a中对应元素出现次数
            for(int j=0;j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    flag++;//a数组每个元素出现次数
                }
            }
            b[i]=flag;//每个元素出现次数赋值给新数组接收，相当于a数组每个元素有次数这个属性
        }
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]+"出现次数："+b[i]+" \t");//b数组是a中每个元素的出现次数
        }
                                                             //取出现次数最大的是多少次
        int max=b[0];
        for(int i=0;i<b.length;i++) {
            if(max<b[i]) {
                max=b[i];
            }
        }
        //取次数最大的数对应的a数组元素
        System.out.println("出现次数最多的数：");
        for(int i=0;i<b.length;i++) {
            if(max==b[i]) {
                System.out.print(nums[i]+" ");
            }
        }
        //取出现次数为1的共有多少元素
        int index=0;
        for(int i=0;i<nums.length;i++) {
            if(b[i]==1)
            {
                index++;
            }
        }
        int c[]=new int[index];//用c数组接收出现次数为1的数
        index=0;
        for(int i=0;i<nums.length;i++) {
            if(b[i]==1)
            {
                c[index]=nums[i];//用c数组接收出现次数为1的数
                index++;//下标自加一
            }
        }
        //取出现一次中最小数值
        int min=c[0];
        for(int i=0;i<c.length;i++) {
            if(min>c[i]) {
                min=c[i];
            }
        }
        System.out.println();
        System.out.println("出现一次中最小数值："+min);*/
    }
}
