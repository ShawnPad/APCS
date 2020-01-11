import java.util.*;
public class Lab{
    //Done 11/14/17 <3
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days tempratures?");
        int length = console.nextInt();
        int[] temp = new int[length];
        for(int i = 0; i<length;i++){
            System.out.println("Day "+(i+1)+"?");
            temp[i]=console.nextInt();
        }
        System.out.println("Average temp = "+average(temp));
        String days = "days";
        if(countAboveAve(temp)==1){
            days = "day";
        }
        System.out.println(countAboveAve(temp)+" "+days+" above average.");
        System.out.println("Tempretures: "+Arrays.toString(temp));
        System.out.println("Coldest Temprature: "+smallest(temp));
        System.out.println("Hottest Temprature: "+largest(temp));
    }
    public static double average(int[] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];
        }
        return (double)sum/a.length;
    }
    public static int countAboveAve(int[] a){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>average(a)){
                count++;
            }
        }
        return count;
    }
    public static int largest(int[] a){
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static int smallest(int[] a){
        int min = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
}