import java.util.*;
public class Lab{
    //Done 11/9/17
    public static int primeFirst = 0;
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\"welcome to java!\"");
        print(countVowels("welcome to java!"));
        System.out.println("\"hello\"");
        print(countVowels("hello"));
        System.out.println();
        System.out.println("Try it yourself(Give me a senetence):");
        String str = console.nextLine();
        System.out.println("\"" +str+ "\"");
        print(countVowels(str));
        System.out.println("Cool lets try something else!\n");
        System.out.println("When given two numbers for example: 20 and 22 it will return "+onlyNonPrimes(20,22)+" if there is are no primes in that interval");
        System.out.println("So when given 12 & 13 it returns "+onlyNonPrimes(12,16));
        System.out.println("Give me two numbers, first a small one then a big one.\n");
        int a = console.nextInt();
        int b = console.nextInt();
        if(a>b){
            antiTrick();
            tryAgain();
        }
        System.out.print("In the interval "+a+" to "+b+" ");
        if(onlyNonPrimes(a,b)){
            System.out.println("there were no primes.");
        } else {
            System.out.println("there was a prime.");
            System.out.println("That first prime was: "+ primeFirst);
        }
        tryAgain();
    }
    public static void tryAgain(){
        while(true){
            System.out.println("\nWould you like to try another interval? Y N");
            String check = console.next();
            if(check.equalsIgnoreCase("chicken")){
                superSecretPrgm();
            }
            if(check.equalsIgnoreCase("Y")){
                runHasPrime();
            } else {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nThanks for trying this program :D\n");
                break;
            }
        }
        System.exit(0);
    }
    public static void antiTrick(){
        System.out.println("\n\n\n\n\nWow you tried to trick me... :[\n\n\nThe first number must be less than the second.");
    }
    public static void runHasPrime(){
        for(int i = 0;i<=15;i++){
            System.out.println();
        }
        System.out.println("Give me two numbers\n");
        int a = console.nextInt();
        int b = console.nextInt();
        if(a>b){
            antiTrick();
        }
        System.out.print("In the interval "+a+" to "+b+" ");
        if(onlyNonPrimes(a,b)){
            System.out.println("there were no primes.");
        } else {
            System.out.println("there was a prime.");
            System.out.println("That first prime was: "+ primeFirst);
        }
    }
    public static void print(int a){
        System.out.println("Number of vowels: "+a+"\n");
    }
    public static int countVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(String str){
        return "aeiou".contains(str.toLowerCase());
        /*str = str.toLowerCase();
        String[] vowels = {"a","e","i","o","u"};
        for(int i = 0; i<vowels.length; i++){
            if(str.equals(vowels[i])){
                return true;
            }
        }
        return false;*/
    }
    public static boolean onlyNonPrimes(int a, int b){
        for(int i = a; i<=b; i++){
            if(isPrime(i)){
                primeFirst = i;
                return false;
            }
        }
        return true;
    }
    //isPrime & countFactors imported from ModifiedPrgm.java
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
//Ignore this stuff pls

    //Super secret stuff
    public static void superSecretPrgm(){
        System.out.println("\n\n\n\n\n\nWow you really typed chicken when I specifically asked for a yes or no answer...");
        System.out.println(" You are pretty cool, but are you lucky? ");
        String pause = console.next();
        fourHeads();
        System.out.println("\nWell thats pretty much it... Would you like to run from the beginning? Y N" );
        String check = console.next();
        if(check.equalsIgnoreCase("Y")){
            System.out.println("\n\n\n\n\n\n");
            mainTwo();
            System.exit(0);
        } else if (check.equalsIgnoreCase("N")){
            System.out.println("\n\n\n\n\n\nSee ya next time!\n\n\n");
            System.exit(0);
        } else {
            System.out.println("Lets not play any more games...");
            System.exit(0);
        }

    }
    //Imported from Lab7 While loops
    public static void fourHeads(){
        int n=0;
        int count = 0;
        while(n<5){
            count++;
            if((int)(2*Math.random())==0){
                System.out.print("H ");
                n++;
            } else {
                System.out.print("T ");
                n=0;
            }
        }
        System.out.println();
        System.out.println(n+" Heads in a row in "+count+" trys!");
        if(count<20){
            System.out.println("I guess you are pretty lucky too.");
        } else {
            System.out.println("Yeah, you are not that lucky tbh...");
        }
    }
    public static void mainTwo(){
        System.out.println("\"welcome to java!\"");
        print(countVowels("welcome to java!"));
        System.out.println("\"hello\"");
        print(countVowels("hello"));
        System.out.println();
        System.out.println("Try it yourself(Give me a senetence):");
        String blank = console.nextLine();
        String str = console.nextLine();
        System.out.println("\"" +str+ "\"");
        print(countVowels(str));
        System.out.println("Cool lets try something else!\n");
        System.out.println("When given two numbers for example: 20 and 22 it will return "+onlyNonPrimes(20,22)+" if there is are no primes in that interval");
        System.out.println("So when given 12 & 13 it returns "+onlyNonPrimes(12,16));
        System.out.println("Give me two numbers, first a small one then a big one.\n");
        int a = console.nextInt();
        int b = console.nextInt();
        if(a>b){
            antiTrick();
            tryAgain();
        }
        System.out.print("In the interval "+a+" to "+b+" ");
        if(onlyNonPrimes(a,b)){
            System.out.println("there were no primes.");
        } else {
            System.out.println("there was a prime.");
            System.out.println("That first prime was: "+ primeFirst);
        }
        tryAgain();
    }
}