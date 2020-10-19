package com.company;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
 /* 假如你准备去海南旅游，现在要在网上订购机票。机票的价格受季节影响、而且头等舱、商务舱、经济舱价格也不同。
      假设机票原价为5000元，4~10月为旺季，旺季头等舱9折，商务舱8折、经济舱7折，其也月份为淡季，淡季头等舱5折，商务舱4折、经济舱3折。
      请编写Java程序，根据出行的月份和选择的舱位输出实际的机票价格*/

        Scanner input=new Scanner(System.in);
        System.out.print("请输入出行的月份：");
        int month= input.nextInt();
        char season=' ';
        if(month<4&&month>0){
            season='a';
        }else if(month<=10&month>=4){
            season='b';
        }else {
            season='a';
        }
        switch (season) {
            case 'a':
                System.out.print(month+"为淡季，头等舱的票价为"+(5000*0.5)+"\t商务舱的票价为"+(5000*0.4)+"\t经济舱的票价为"+(5000*0.3));
                break;
            case 'b':
                System.out.print(month+"为旺季，头等舱的票价为"+(5000*0.9)+"\t商务舱的票价为"+(5000*0.8)+"\t经济舱的票价为"+(5000*0.7));
                break;
            default:
        }










    }
}
