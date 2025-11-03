package SingleLinkedList;

public class capitalToSmall {
    public static void main(String[] args) {
        String value="Hello World";

        int len=value.length()-1;
        for (int i=len;i>=0;i--){
            char ch=value.charAt(i);
            char chd='H';
            int x=104;
            //System.out.print((+chd)x);
            System.out.println((char)x); // h
        }

    }
}
