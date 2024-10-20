import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pls input a String : ");
        String str=scanner.nextLine();
        StringBuilder sb=new StringBuilder(str);
        String str1=sb.reverse().toString();
        System.out.println("Reverse String is "+str1);
       if (str.equals(str1)){
           System.out.println("Palindrome is True");
       }
       else {
           System.out.println("Palindrome is False ");
       }

    }
}
