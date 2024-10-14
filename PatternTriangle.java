import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Plese input value : ");
        int value= scanner.nextInt();
        for(int i=0;i<value;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
