import java.util.*;
public class Lab{
    //Done
    static ArrayList<Integer> a = new ArrayList<Integer>();
    static ArrayList<String> b = new ArrayList<String>();
    static ArrayList<Double> c = new ArrayList<Double>();
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            a.add((int)(100*Math.random()));
        }
        System.out.println(a);
        System.out.println(smallest(a));
        b.add("Dog");
        b.add("Cat");
        b.add("Pigg");
        System.out.println(b);
        System.out.println(longest(b));
        c.add(10.0);
        c.add(5.0);
        c.add(3.0);
        System.out.println(c);
        remove(c,5.0);
        System.out.println(c);

    }
    public static int smallest(ArrayList<Integer> b){
        int temp = b.get(0);
        for(Integer c: b){
            if(c<temp){
                temp = c;
            }
        }
        return temp;
    }
    public static String longest(ArrayList<String> b){
        int temp = b.get(0).length();
        String temp2  = b.get(0);
            for(String c: b){
                if(c.length()>temp){
                temp = c.length();
                temp2 = c;
            }
        }
        return temp2;
    }
    public static void remove(ArrayList<Double> b,double x){
            for(int i = b.size()-1; i>=0; i--){
                if(c.get(i)==x){
                    c.remove(i);
                }
            }
    }
}
