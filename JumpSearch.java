public class JumpSearch {

    int jmpSearch(int[] jmparray,int searchVal){
        int temp=0;
        for (int i = 0; i <jmparray.length ; i++) {
        temp=jmparray[i];


        }
        return temp;


       //return -1;
    }

    public static void main(String[] args) {
        JumpSearch js=new JumpSearch();
        int[] jmparray={1,2,3,4,5,6,7,8,9,10,11,12};
        int searchVal=2;
        int result=js.jmpSearch(jmparray,searchVal);
        System.out.println("result is " +result);
    }
}
