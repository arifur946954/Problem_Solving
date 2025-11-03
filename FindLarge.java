public class FindLarge {
    public static void main(String[] args) {
        int[] arr={1,50,47,100,54,1541,2,1000};
        int len=arr.length;
        int first=arr[0];
        int next=arr[1];
        for (int i = 1; i < len; i++) {
            if(arr[i]>first){
                first=arr[i];
            }
            else {
                first=first;
            }


        }
        System.out.println("max length of array is "+first);
    }
}
