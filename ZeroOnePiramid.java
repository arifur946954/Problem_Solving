import java.util.Scanner;
public class ZeroOnePiramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input total rows : ");
        int rows=scanner.nextInt();
     for (int i=1;i<=rows;i++){
         for (int j = 1; j <= i; j++) {

             if ((i+j)%2==0){
                 System.out.print("1");
             }
             else{
                 System.out.print("0");

             }

         }
         System.out.println();
     }
    }
}
