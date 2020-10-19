package 数组;

public class Test20_3 {
    public static void main(String[] args) {
        int[][] stu=new int[3][5];
        int[] sum=new int[3];
        int[] avg=new int[5];
        int a=0;//Java，JSP，CoreJava，MySQL和HTML5
        System.out.println("学号"+"\t"+"Java"+"\t\t"+"JSP"+"\t\t"+"CoreJava"+"\t\t"+"MySQL"+"\t\t"+"HTML5"+"\t\t"+"总成绩");
        for(int i=0;i< stu.length;i++){
            System.out.print(i+1+"\t");
            for(int j=0;j<stu[i].length;j++){
                stu[i][j]=(int)(100*Math.random());
                System.out.print(stu[i][j]+"\t\t\t");
                sum[i] +=stu[i][j];
                avg[j] +=stu[i][j];
            }
            a +=sum[i];
            System.out.print("");
            System.out.println(sum[i]);
        }
        System.out.print("平均分：");
        for(int i=0;i<avg.length;i++){
            System.out.print(avg[i]/3+"\t\t");
        }
        System.out.print(a/3);
    }
}
