public class ReverseString {
    public static void main(String[] args) {
        //input "Hello world Arif"
        //output="olleh dlrow fira"
        String sr = "hello world arif";
        String[] size=sr.split(" ");
        String first=size[0];
        String second=size[1];
        String third=size[2];

        char ch=' ';
        int len=sr.length();
        for (int i = len-1; i >= 0; i--) {
          ch=   sr.charAt(i);
            System.out.print(ch);
        }


    }
}
