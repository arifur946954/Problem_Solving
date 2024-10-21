import java.util.Scanner;

public class FindCharInStr {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input String : ");
        String str=scanner.nextLine();

        Scanner Chscanner=new Scanner(System.in);
        System.out.println("Input Targer Character : ");
        char ch=Chscanner.next().charAt(0);
        int len=str.length();
        for (int i=0;i<len;i++){
            if (str.charAt(i)==ch){
                System.out.println(ch +" Found "+ (i+1) + " th Position");


            }
            else {
                //System.out.println(ch +" Not found Provided String");
            }
        }

    }
}
