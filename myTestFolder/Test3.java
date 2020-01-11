import java.util.*;
public class Test3{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Give me a number");
        int n = console.nextInt();
        System.out.println(n+" Is this your number? ");
        System.out.println("Y N");
        String m = console.nextLine();
        if(m=="Y"){
            System.out.println("test");
            System.out.println("Okay, here are how many factors and the primes to that number:");
            printPrimes(n);
            System.out.println(countFactors(n));
        }
    }
    public static void printPrimes(int x){
        for(int i=1; i<=x; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int x){
        return countFactors(x)==2;
    }
    public static int countFactors(int x){
        int n = 0;
        for(int i=1; i<=x; i++){
            if(x%i==0){
                n++;
            }
        }
        return n;
    }
}