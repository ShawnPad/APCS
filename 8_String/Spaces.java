import java.util.*;
public class Spaces {
    //Done 10/31/17
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str= "This line has four spaces";
        System.out.println("\"~Example~\nThis string:  This line has four spaces\"");
        countSpacesFLoop(str);
        countSpacesWLoop(str);
    }
    public static void countSpacesWLoop(String str){
        int count=0;
        while(str.indexOf(" ")!=-1){
            count++;
            str=str.substring(str.indexOf(" ")+1);
        }
        System.out.println(count+" spaces");
    }
    public static void countSpacesFLoop(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.substring(i).startsWith(" ")){
                count++;
            }
        }
        System.out.println(count+" spaces");
    }
}