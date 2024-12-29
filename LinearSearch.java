import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input array of length : ");
         int len=  scanner.nextInt();
         boolean searchValue=false;


         int[] arr=new int[len];
         for (int i=0;i<len;i++){
             System.out.print("Element " + (i + 1) + ": ");
             arr[i]=scanner.nextInt();

         }

        System.out.println("You entered the array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");  // Printing each element of the array
        }
        System.out.println();
        System.out.print("please Searching value : ");
        int searchVl=scanner.nextInt();

        for (int i=0;i<len;i++){
            if (arr[i]==searchVl){
                searchValue=true;
                System.out.println("Searching value is "+searchVl + " and position is "+(i+1));
            }


        }
        if (searchValue==false){
            System.out.println("No Data Found");
        }


    }
}
