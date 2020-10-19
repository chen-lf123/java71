package 数组;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        //在元数组中插入一个新的字符串
        String[] oldFruits={"Apple","Peach","Pear","Banana","Grape"};
        String[] newFruits=new String[oldFruits.length+1];
        //System.arraycopy(原数组，原数组下标，新数组，新数组下标，数组长度)将指定原数组中的数组从指定位置复制到
        System.arraycopy(oldFruits,0,newFruits,0,oldFruits.length);
        for(int i=0;i< newFruits.length;i++){
            if(newFruits[i]==null){
                newFruits[i]="Orange";
                break;
            }
        }
        System.out.println(Arrays.toString(newFruits));


        //合并数字组
        int[]a={1,2,3};
        int[]b={4,5,6,};
        int[]c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));
    }
}
