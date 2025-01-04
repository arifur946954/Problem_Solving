public class SelectionSort {
    public static void main(String[] args) {
        int[] selectSort={1,52,2,1,-10,45,20,-90,15,20,11,1,25,-1000};
        int len=selectSort.length;
        int minIndex=-1;
        int temp=0;

        for (int i = 0; i < len-1; i++) {
            minIndex=i;
            for (int j = i+1; j < len; j++) {
                if (selectSort[minIndex]>selectSort[j]){
                    minIndex=j;
                }

            }
            temp=selectSort[i];
            selectSort[i]=selectSort[minIndex];
            selectSort[minIndex]=temp;


        }

        for (int sel:selectSort){
            System.out.println(" "+sel);
        }

    }

}
