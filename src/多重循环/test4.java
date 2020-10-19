package 多重循环;

public class test4 {
    //打印9*9乘法表 1*1=1 2*3=6
    public static void main(String[] args) {
        int i,j;
        for(i=1 ; i<=9 ; i++){
            for(j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
            /*//String.format 格式化字符串
            //System.out.println(String.format("%d*%d=%d ",i,j,i*j));
            双重循环的使用
            外层 循环变量变化一次，内层 循环变量变化一遍
            找规律很重要，固定写法可以记忆，代码理解
            需要先确定外层循环，内层循环
            多练习
            */

        }
    }

}
