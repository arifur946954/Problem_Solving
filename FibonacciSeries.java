public class FibonacciSeries {
    public static void main(String[] args) {
        int value=10;
        int first=0;int second=1;
        for(int i=0;i<value;i++){
            System.out.print(" "+first);//0,1,1
            int next=first+second;//3
            first=second;//1
            second=next;//2

        }

    }
}

