import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input number : ");
        int num=  scanner.nextInt();
        int result=1;
        for (int i=1;i<=num;i++){
           result= result*i;
        }
        System.out.println("factorial Number is: " +result);

    }
}
