import java.util.*;
public class Driver{
    //Done
    public static Scanner console = new Scanner(System.in);
    static Question first;
    public static void main(String[] args) {
        first = new Question("Which planet is closest to the sun?", true, "Venus");
        first.addChoice("Venus");
        first.addChoice("Earth");
        first.addChoice("Jupiter");
        first.addChoice("Mars");
        System.out.println(first);
    }
}
