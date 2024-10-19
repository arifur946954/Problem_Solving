import java.util.Scanner;

public class CharStrReverse {
    public static void main(String[] args) {
        String result="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert  String : ");
        String str=scanner.nextLine();
        System.out.println("String is : "+str);
       int StLength= str.length();
        char[] ch = new char[StLength];
        for (int i=0;i<StLength;i++){
         ch[i]=str.charAt(i);
         result=result+ch[i];
           System.out.println("Character is: '" + ch[i] + "'");
            System.out.println("String is: '" + result);
       }



    }
}
