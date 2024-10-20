import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pls input a String : ");
        String str=scanner.nextLine();
        int len=str.length();
        String fnStr="";
        //boolean res=true;
        char[] ch=new char[len];

        for (int i=len-1;i>=0;i--){
         ch[i]=str.charAt(i);
         fnStr=fnStr+ch[i];
        }
        System.out.println("Reverse String is "+fnStr);
        if (str.equals(fnStr)){
            System.out.println("Palindrome is True");
        }
        else {
            System.out.println("Palindrome is False ");
        }
    }
}
