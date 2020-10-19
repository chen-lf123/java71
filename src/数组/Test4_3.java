package 数组;

public class Test4_3 {
    public static void main(String[] args){
        //使用数组静态初始化方式初始化一个大小为10的整型数组并输出
        int[] num=new int[]{12,56,98,45,3,56,7,98,8,23};
        for(int i=0;i< num.length;i++){
            System.out.println("num["+i+"]="+num[i]);
        }

    }
}

