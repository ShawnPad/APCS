import java.util.*;
public class Lab9{
    public static void main(String[] args){
    parseAddress("123 Adams st Dorchester, MA 02122");
    parseAddress("9 Moon St Charlestown, MA 02113");
    }
    public static void parseAddress(String str){
        System.out.println("Number: " +str.substring(0,str.indexOf(" ")));
        str = extract(str);
        System.out.print("Street: " +str.substring(0,str.indexOf(" ")));
        str = extract(str);
        System.out.println(" "+str.substring(0,str.indexOf(" ")));
        str = extract(str);
        System.out.print("City/State: " +str.substring(0,str.indexOf(" ")));
        str = extract(str);
        System.out.println(" "+str.substring(0,str.indexOf(" ")));
        str = extract(str);
        System.out.println("Zip code: " +str.substring(0,str.length()));
    }
    public static String extract(String str){
        return str.substring(str.indexOf(" ")+1,str.length());
    }
}