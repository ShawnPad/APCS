import java.util.*;
public class PointTester{
    //Done
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(10,17);
        System.out.print("Point 1: ");
        p1.printPoint();
        System.out.print("Point 2: ");
        p2.printPoint();
        System.out.println("Distance between points: "+p1.distance(p2));
        /*System.out.println("Do you want to move a point and which one? p1 or p2");
        String a = console.nextLine();
        if(a.equals("p1")){
            System.out.println("How much do you want to move p1 by? ");
            System.out.print("x: ");
            int x = console.nextInt();
            System.out.print("y: ");
            int y = console.nextInt();
            p1.translate(x,y);
            System.out.print("\nNew Point 1: ");
            p1.printPoint();
        } else if(a.equals("p2")){
            System.out.println("How much do you want to move p2 by? ");
            System.out.print("x: ");
            int x = console.nextInt();
            System.out.print("y: ");
            int y = console.nextInt();
            p2.translate(x,y);
            System.out.print("\nNew Point 1: ");
            p2.printPoint();
        }
        */
        System.out.println("Let's try some circles!");
        Circle cir = new Circle(10,10,20);
        System.out.println(cir.getArea());
        Point random = new Point(5,5);
        cir.printProp();
        System.out.println(cir.isOnCircle(random));
        System.out.println(cir.isOnCircle(50,50));
    }
}
