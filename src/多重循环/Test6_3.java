package 多重循环;

public class Test6_3 {
    public static void main(String[] args){
        int i=100;
        do{
            System.out.println(i);
            i=i-5;
        }while (i>0);
        /*int i=100;
        while(i>0){

            System.out.println(i);
            i=i-5;
        }*/
        /*for(int i=100; i>0; i-=5){
            System.out.println(i);
        }*/
    }
}
