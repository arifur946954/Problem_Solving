public class palindromeB {
    public static void main(String[] args) {
        String v1=" a b a  Aba";
        String vl=v1.replaceAll("\\s+", "");//remove all space every where
        //String vl=v1.replaceAll("^\\s+", "");//remove  space only start position

        String value=vl.toLowerCase();//for case sensetive
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
