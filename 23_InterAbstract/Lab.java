import java.util.*;
public class Lab{
    //Done
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Movable[] a = new Movable[2];
        List<Movable> b = new ArrayList<Movable>();
        a[0] = new MovableCircle(0,0,1);
        a[1] = new MovablePoint(0,0);
        b.add(new MovableCircle(0,0,1));
        b.add(new MovablePoint(0,0));
        b.get(0).moveUp();
        System.out.println(b.get(0));
    }
}
