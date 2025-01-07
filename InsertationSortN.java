public class InsertationSortN {
    public static void main(String[] args) {
        int[] insertSort={5,2,1,3,5,4,55,45,12,1,52,1000,25};
        int len=insertSort.length;
        for (int i = 1; i < len; i++) {
            int j= i-1;
            int key=insertSort[i];
            while (j>=0 && insertSort[j]>key){
                insertSort[j+1]=insertSort[j];
                j=j-1;
            }
            insertSort[j+1]=key;


        }
        for (int arr:insertSort){
            System.out.print(" "+arr);
        }
    }
}
