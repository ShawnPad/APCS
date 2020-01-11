import java.util.*;
public class mario{
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("How tall do you want this pyramid?");
        //int a = console.nextInt();
        buildHalfPyr(10);
    }
    public static void buildHalfPyr(int a){
        int t = a*2;
        int w = t*2-1;
        int count = 0;
        for(int i = 0; i<=t/2;i++){
            for(int j = 0; j<=(w/2)-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=count/2; j++){

                if(true){
                    System.out.print("#");

                }
            }
            for(int j = 0; j<=(w/2)-i; j++){
                System.out.print(" ");
            }
            count+=2;
            System.out.println();
        }

    }
}