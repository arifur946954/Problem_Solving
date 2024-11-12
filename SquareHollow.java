import java.util.Scanner;

public class SquareHollow {
    public static void main(String[] args) {
        System.out.println("please input lenth : ");
        Scanner scanner =new Scanner(System.in);
        int len=scanner.nextInt();
        for (int i=0;i<len;i++){
            for (int j=0;j<len;j++){
                if (i==0 || j==0 || i==len-1 || j==len-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
       }
    }
}
