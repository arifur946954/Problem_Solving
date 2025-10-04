public class reverseStrings {
    public static void main(String[] args) {
        String name="hello world";
        int len=name.length();
        char[] ch=name.toCharArray();

        System.out.println("character is "+ch);

       String reversed="";
        for (int i = len-1; i >=0 ; i--) {
            reversed=reversed+ch[i];


        }
        System.out.println("reversed string is "+reversed);

    }
}
