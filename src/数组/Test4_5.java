package 数组;

public class Test4_5 {
    public static void main(String[] args){
        // 获取数组最大值和最小值操作：
        //利用Java的Math类的random()方法，随机生成10个数，填充一个数组，并找出产生10个随机数中最大的、最小的数。
        //提示：使用 int num=(int)(100*Math.random());
        int[] num=new int[10];
        for(int i=0;i<num.length;i++){
            num[i]=(int)(100*Math.random());
        }
        System.out.println("数组元素中有：");
        for(int n:num){
            System.out.print(+n+"\t");
        }
        int max=num[0];
        int min=num[0];
        for(int i=0;i< num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);


        /*int[]array=new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]=((int)(Math.random()*1000));
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(max<array[i])
                max=array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if(min>array[i])
                min=array[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);*/
    }
}
