import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert the value : ");
        int rows=scanner.nextInt();
         for( int i=1;i<rows;i++){

             for (int j=rows;j>=i;j--){
                 System.out.print(" ");
             }
             for (int k=1;k<=i;k++){
                 System.out.print(" "+i);
             }
             System.out.println();
          }
    }
}
