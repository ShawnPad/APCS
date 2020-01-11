import java.util.*;
public class Parsing {
//Done 10/13/17
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println(" Example: ");
        parseName("Marshall Bruce Mathers");
        System.out.println();
        System.out.println("Enter your name:");
        String str= console.nextLine();
        System.out.println();
        parseName(str);
    }
    public static void parseName(String str){
        System.out.println("First: "+str.substring(0,str.indexOf(" ")));
        str=str.substring(str.indexOf(" ")+1);
        System.out.println("Middle: "+str.substring(0,str.indexOf(" ")));
        str=str.substring(str.indexOf(" ")+1);
        System.out.println("Last: "+str.substring(0));
    }
}
