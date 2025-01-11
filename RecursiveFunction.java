public class RecursiveFunction {

    public static  int fun(int num){
        if ( num==0 || num==1){
           return 2;
        }

        return num * fun(num-1);//when num==0 || num==1 then (num * return value) that means if return 5 then fun(num-1)=5 so return is :6*5*4*3*2*5


    }

    public static void main(String[] args) {
        int num=6;
       int result=fun(num);
        System.out.println("Output is : "+result);

    }
}
