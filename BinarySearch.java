import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int[] binarySrch,int serchVal) {
    int low=0;
    int high=binarySrch.length-1;
    int mid=(high+low)/2;

    while (low<=high){
        if(binarySrch[mid]==serchVal){
            return mid;
        } else if (serchVal>binarySrch[mid]) {
            low=mid+1;
            mid=(low+high)/2;

        }else if (serchVal<binarySrch[mid]) {
            low=0;
            high=mid-1;
            mid=(low+high)/2;

        }
    }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bns=new BinarySearch();
        int[] binarySrch={1,2,3,4,5,6,7,8,9,10};
        int serchVal=5;
      int result=  bns.binarySearch(binarySrch,serchVal);
      if (result==-1){
          System.out.println("No data Found");
      }else {
          System.out.println("for search value of :"+serchVal +" index of :"+(result+1));
      }

    }

}
