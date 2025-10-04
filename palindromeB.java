public class palindromeB {
    public static void main(String[] args) {
        String vl="Aba";
        String value=vl.toLowerCase();
        String Reversed="";
        int len=value.length()-1;
        for (int i = len; i >= 0; i--) {
            Reversed=Reversed+ value.charAt(i);
        }
        if(value.equals(Reversed)){
            System.out.println("this "+value + " is palindrome");
        }
        else{
            System.out.println("this "+value + " is Not palindrome");
        }

    }
}
