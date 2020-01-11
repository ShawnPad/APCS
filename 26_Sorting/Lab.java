import java.util.*;
public class Lab{
    //Done
    static int count = 0;
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        int[] b = new int[100];
        for(int i = 0; i<b.length; i++){
            b[i] = (int)(100*Math.random());
        }
        System.out.println(Arrays.toString(b));
        selectionSort(b);
        System.out.println(Arrays.toString(b));
        //System.out.println(binarySearch(b,10));
    }
    public static int binarySearch(int[] a, int target ){

        int min = 0;
        int max = a.length-1;
        int mid = (max+min)/2;
        while(max>min){
            mid = (max+min)/2;
            if(a[mid]<target){
                min = mid +1;
            } else if(a[mid]>target){
                max = mid-1;
            } else if (a[mid] == target){
                return mid;
            }

        }
        return -1;
    }
    public static void selectionSort(int[] a){

        for(int i = 0; i < a.length; i++){
            int index = i;
            int small = a[i];
            for(int j = i; j<a.length; j++){
                if(a[j]<small){
                    index = j;
                    small = a[j];
                }
                count++;
            }
            swap(a, i, index);
            count++;
        }
        System.out.println(count);
    }
    public static void swap(int[] a, int index, int index1){
        int temp = a[index];
        a[index] = a[index1];
        a[index1] = temp;
        count++;


    }
}