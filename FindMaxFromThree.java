public class FindMaxFromThree {
    public  static  void main (String[] args){
        int num1=10;
        int num2=30;
        int num3=200;
        int temp;
        if(num1>num2){
          temp=num1;
        }
        else temp=num2;

    if(temp > num3){
        System.out.println("out put is: " +temp);
    }
    else{
        System.out.println("output is: " +num3);
    }

}
}