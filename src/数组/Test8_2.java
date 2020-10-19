package 数组;

public class Test8_2 {
    public static void main(String[] args){
        //定义一个数组int[] nums={8,7,3,9,5,4,1}
        //输出数组中的最大值和最大值所在的下标
         int[] nums={8,7,3,9,5,4,1};
         int max=nums[0];
         int index=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]>max){
                 max=nums[i];
                 index=i;
                 System.out.println("数组中的最大值为："+max);
                 System.out.println("最大值的下标为：nums["+i+"]="+nums[i]);
             }
         }
         System.out.println(index);
    }
}
