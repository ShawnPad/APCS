public class Lab6{
//Done 9/21/17
    public static void main(String[] args){
        System.out.println(String.valueOf(countFactors(24)));
        System.out.println(String.valueOf(isPrime(27)));
        System.out.println();
        printPrimes(11);
        System.out.println();
        printPrimes(8);
        System.out.println();
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