import java.util.*;
public class Penny{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("How many Pennies?");
        int h=console.nextInt();
        quarter(h);
    }
/*    public static void dollar(int n){
        int d = n/100;
        if (n%100!=0){
            quarter(n%100);
        }
        System.out.println("Dollars: "+d);
    }*/
    public static void quarter(int n){
        int q = n/25;
        if (n%25!=0){
            dime(n%25);
        }
        System.out.println("Quarters: "+q);
    }
    public static void dime(int n){
        int d = n/10;
        if (n%10!=0){
            nickel(n%10);
        }
        System.out.println("Dimes: "+d);
    }
    public static void nickel(int n){
        int ni = n/5;
        if (n%5!=0){
            penny(n%5);
        }
        System.out.println("Nickels: "+ni);
    }
    public static void penny(int n){
        System.out.println("Pennies: "+n);
    }
}
