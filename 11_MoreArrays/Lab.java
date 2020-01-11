import java.util.*;
public class Lab{
    //Done 11/19/17
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a1 = {12, 34, 56};
        int[] a2 = {20, 50, 80};
        swapAll(a1,a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        int[] b1 = {12, 34, 56};
        int[] b2 = {7, 8, 9, 10};
        System.out.println(Arrays.toString(merge(b1,b2)));
    }
    public static void swapAll(int[] a, int[] b){
        for(int i = 0; i<a.length; i++){
            int temp = b[i];
            b[i]=a[i];
            a[i]=temp;
        }
    }
    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for(int i = 0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int i = 0; i<b.length; i++){
            c[i+a.length]=b[i];
        }
        return c
    }
}
