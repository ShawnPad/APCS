import java.util.*;
public class Lab8{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String in1 = console.next();
        String in2 = console.next();
        System.out.println("Your gangsta name is "+in1.substring(0,1)+". Diddy "+in2.toUpperCase()+" "+in1+"-izzle");
    }
}
/*import java.util.*;
public class Lab8{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String in = console.nextLine();
        System.out.println("Your gangsta name is "+gangstaName(in));
    }
    public static String gangstaName(String str){
        return str.substring(0,1)+". Diddy"+(str.substring(str.indexOf(" "),str.length())).toUpperCase()+" "+str.substring(0,str.indexOf(" "))+"-izzle";
    }
}*/