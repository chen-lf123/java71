package 数组;

import java.util.Arrays;

public class Test11_3 {
    public static void main(String[] args){
        //int[] arr = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重
        int[] arr11={1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        int[] arr12=new int[0];
        boolean isRepeat=false;
        int index=0;
        for(int i=0;i< arr11.length;i++){
            isRepeat=false;
            for(int j=i+1;j< arr11.length;j++){
                if(arr11[i]==arr11[j]){
                    isRepeat=true;
                    break;
                }
            }
            if (!isRepeat){
                arr12=Arrays.copyOf(arr12,arr12.length+1);
                arr12[index++]=arr11[i];
            }
        }
        System.out.println(Arrays.toString(arr12));
        /*int[] a = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        int[] tempArr=new int[a.length];
        int t=0;

        for (int i=0;i<a.length;++i){
            boolean isTrue=true;
            for (int j=i+1;j<a.length-1;++j) {
                if (a[i] == a[j]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue){
                tempArr[t]=a[i];
                ++t;
            }
        }
        System.out.println(Arrays.toString(tempArr));
        int[] afterArr=new  int[t];
        System.arraycopy(tempArr,0,afterArr,0,t);
        System.out.println(Arrays.toString(afterArr));
        return;*/



    }
}
