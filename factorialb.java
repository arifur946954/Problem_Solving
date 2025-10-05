public class factorialb {
    public static void main(String[] args) {
        int n=5;
         int result=factorial(n);
        System.out.println("factorial numbr is"+result);

    }

    public static  int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
          return  n*(n-1);
        }
    }
}

