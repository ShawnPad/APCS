import java.util.*;
public class Lab{

    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3,4);
        MyComplex c2 = new MyComplex(5,6);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(MyComplex.multiplyNew(c1,c2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(MyComplex.addNew(c1,c2));
        System.out.println(c1.isReal());
        System.out.println(c2.isImaginary());
        c2.conjugate();
        System.out.println(c2);
        c2.multiply(c1);
        System.out.println(c1);
        c1.add(c2);
        System.out.println(c2);
    }
}
