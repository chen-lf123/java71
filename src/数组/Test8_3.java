package 数组;

public class Test8_3 {
    public static void main(String[] args){
        //向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        //1)升序输出、降序输出
        //2)输出总和、平均数
        double sum=0;
        int[] nums=new int[10];
        for(int i=0;i< nums.length;i++){
            nums[i]=(int)(10*Math.random());
            sum +=nums[i];
        }
        System.out.println("数组中的元素有：");
        for(int n:nums){
            System.out.print(+n+"\t");
        }
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max>nums[i]){
                max=nums[i];
            }
            if(min<nums[i]){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j< nums.length-1-i;j++){

                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("数组升序输出为：");
        for(int num:nums){
            System.out.print(num+"\t");
        }
        for(int i=0;i< nums.length-1;i++){
            for(int j=0;j< nums.length-1-i;j++){
                if(nums[j]<nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("数组降序输出为：");
        for(int num:nums){
            System.out.print(num+"\t");
        }
        System.out.println();
        System.out.println("数组的总和为："+sum);
        System.out.println("数组的平均数为："+sum/10);
    }
}
