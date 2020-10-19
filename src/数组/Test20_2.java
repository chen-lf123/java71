package 数组;

public class Test20_2 {
    public static void main(String[] args) {
        //3、公司年销售额求和 某公司按照季度和月份统计的数据如下：单位(万元)
        //第一季度：22,66,44  第二季度：77,33,88 第三季度：25,45,65 第四季度：11,66,99 提示：
        //1、按照季度列出二维数组；2、分别对每个一维数组中的元素进行加法运算；3、输出运算结果
        int[][] sales={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum=0;
        for(int i=0;i<sales.length;i++){
            System.out.print("第"+(i+1)+"季度的销售额为：\t");
            for(int j=0;j< sales[j].length;j++){
                System.out.print(sales[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i< sales.length;i++){
            for(int j=0;j<sales[j].length;j++){
                sum +=sales[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("四个季度的销售总额为："+sum);
    }
}
