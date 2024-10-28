public class BubbleSOrt {
    public static void main(String[] args) {
        Integer[] val={1,52,10,78,2,58,54,4};
        int len=val.length;
        for (int i=0;i<len;i++){
            for (int j=1;j<len-i;j++){
                if (val[j-1]>val[j]){
                    int temp=val[j-1];
                    val[j-1]=val[j];
                    val[j]=temp;
                }

            }

        }
        System.out.print("[");
        for (int i=0;i<val.length;i++){

            System.out.print(val[i]+" ");
        }
        System.out.print("]");

    }
}

//Bubble sort has a time complexity of O(N2) that makes it very slow for large data sets.
