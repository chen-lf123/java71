package 多重循环;

import java.util.*;

public class test5_7 {
    public static void main(String[] args){
        //声明变量
        String root="admin";//用户名
        int passwd=123456;//密码
        int time=0;//循环次数

        int sum=0;//总计次数
        Scanner input=new Scanner(System.in);//获取键盘输入
//for循环内
        for(time=2;time<=3&&time>=0;time--){
//用户输入
            System.out.print("请输入用户名");
            root=input.next();
            System.out.print("请输入密码");
            passwd=input.nextInt();
            sum++;
//判断用户输入用户名是否是jim并且密码=123456;
            if("admin".equals(root)&&passwd==123456){
                System.out.println("登录成功，欢迎进入二次元系统");
                break;
            }
//当用户输入次数少于三时
            else if(sum<3){
                System.out.println("输入错误，您还有"+time+"次机会\n");
                continue;
//当用户输入3次错误后；
            }else if(sum==3){
                System.out.println("输入错误，您还有"+time+"次机会\n");
                System.out.println("你没有权限进入系统");
            }
        }
    }
}
