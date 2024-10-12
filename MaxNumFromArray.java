public class MaxNumFromArray {
    public  static void  main (String[] args){
        int num[]={10,20,45,1,25,65,521,12,0};
        int len=num.length;
        int temp=0;
        for(int i=0;i<len;i++){
           if (temp<num[i]) {
               temp = num[i];//10,20,45,
           }
        }
        System.out.println("max number is: " +temp);
    }
}
