import java.util.*;
public class ATest{
    public static void main(String[] args) {
        //System.out.println(withoutX2("xHi"));
        //java();
        //String str = "a";
        //String str1 = "aeiou";
        //System.out.println(str1.contains(str));
        int[] random = new int[5];
        for(int i = 0; i<random.length; i++){
            random[i] = (int)(50*Math.random());
        }
        System.out.println(Arrays.toString(random));
        System.out.println(APCS(random));
        //System.out.println(15%20);
    }
    public static int APCS(int[] a){
        int g,s;
        g = a[0];
        s = g;
        for(int i : a){
            if(i>g)
                g = i;
            if(i<s)
                s = i;
        }
        return s + g;
    }
    public static void java(){
        String str = "java";
        String str1 = "java";
        if(str==str1){
            str= "python";
            str1= "funions";
        }
        System.out.println(str+" "+str1);
    }
    public static String withoutX2(String str) {
        if(str.contains("x")){
            while(str.indexOf("x")!=-1){
                str = str.substring(0,str.indexOf("x")) + str.substring(str.indexOf("x")+1);
            }
            return str;
        } else {
        return str;
        }
    }
}