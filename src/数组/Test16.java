package 数组;
//二分查找法
public class Test16 {
   /* public static void main(String[] args){
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int searchNum=1;//要查找的数字
        int startIndex=0;//定义开始查找的范围的下标值
        int endIndex= arr.length-1;//
        int midIndex=-1;
        boolean flag=false;

        do{
            midIndex=(startIndex+endIndex)/2;
            if(arr[midIndex]==searchNum){
                System.out.println("恭喜你，找到这个数，它的下标为："+midIndex);
                flag=true;
                break;
            }else if(arr[midIndex]>searchNum){
                endIndex=midIndex-1;
            }else{
                startIndex=midIndex+1;
            }
        }while (startIndex<=endIndex);
        if(!flag){
            System.out.println("很抱歉,没有找到你要找的数字");
        }
    }*/



    public static int binarySearch(int[] arr,int num){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]<num){
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={5,13,19,21,37,56,64,75,80,88,92};
        int index=binarySearch(arr,21);
        System.out.println("二分法查找算法测试");
        System.out.println("key=21的下标为："+index);
    }
}
