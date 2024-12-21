import java.util.Scanner;

public class NumberTriAngular {
    public static void main(String[] args) {
        System.out.println("please input lenth : ");
        Scanner scanner =new Scanner(System.in);
        int len=scanner.nextInt();
        for (int i=0;i<len;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
