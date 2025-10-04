public class pointer {
double length;
double breath;
}

class RectangleDemo{
    public static void main(String[] args) {
  pointer r1=new pointer();
  pointer r2=r1;
  pointer r3=r1;

  r1.length=10;
  r2.length=20;
        r2.length=30;
        System.out.println("Pointer r1 is "+r1.length);
        System.out.println("pointer r2 is "+r2.length);
        System.out.println("pointer r2 is "+r3.length);

    }
}
