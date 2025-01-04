public class BubbleSortNw {
    public static void main(String[] args) {
        int[] bubbleSort={1,5,9,2,4,12,31,52,20,1};
        int length=bubbleSort.length;
        int temp=0;
        for (int i=0;i<length;i++){
            for (int j = 0; j < length-i-1; j++) {
                if (bubbleSort[j]>bubbleSort[j+1]){
                    temp=bubbleSort[j];
                    bubbleSort[j]=bubbleSort[j+1];
                    bubbleSort[j+1]=temp;

                }



            }

        }
        System.out.print("[");
        for (int j  = 0; j < length; j++) {
            System.out.print( +bubbleSort[j]+" ");
        }
        System.out.print("]");

    }
}
