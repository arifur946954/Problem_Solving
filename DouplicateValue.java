import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DouplicateValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleaaw insert a value : ");
        String input=scanner.nextLine();

        HashMap<Character,Integer> hash=new HashMap<>();
        for (char ch:input.toCharArray()){
            if (hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)+1);
            }
            else {
                hash.put(ch,1);
            }

        }
        System.out.println(hash);
        System.out.println("Duplicate value : ");
        for (Map.Entry<Character,Integer> entry: hash.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry);
            }

        }
    }
}
