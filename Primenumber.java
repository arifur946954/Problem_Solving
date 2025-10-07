public class Primenumber {
    public static void main(String[] args) {
        int num=11;
        boolean prime=true;
        if(num<=2 && num>0){
            System.out.println(num+ " is a prime number ");
            return;
        }
        if(num>2){
            for (int i=2;i<num;i++){
                if (num%i==0){
                   prime=false;
                }
            }
        }
        if (prime){
            System.out.println(num+ " is prime ");
        }
        else {
            System.out.println(num+  " is  not prime ");
        }
    }
}
