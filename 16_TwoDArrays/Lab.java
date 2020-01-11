import java.util.*;
public class Lab{
    //Done
    static MagicSquare test;
    public static Scanner console = new Scanner(System.in);
    static int[][] c;
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8}};
        printTranspose(a);
        test = new MagicSquare();
        System.out.println(test.diagSums(34));
        System.out.println(test.exactlyOnce());
        System.out.println(test.isMagic());
        boolean testIf = true;
        int count = 0;
        while(testIf){
            //int[][] b = {{(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random())},{(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random())},{(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random())},{(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random()),(int)(20*Math.random())}};
            //int[][] b = {{(int)(10*Math.random()),(int)(10*Math.random()),(int)(10*Math.random())},{(int)(10*Math.random()),(int)(10*Math.random()),(int)(10*Math.random())},{(int)(10*Math.random()),(int)(10*Math.random()),(int)(10*Math.random())}};
            int[][] b = {{4,9,2},{3,5,7},{8,1,6}};
            MagicSquare d = new MagicSquare(b);
            if (d.isMagic()){
                System.out.println("Found!");
                testIf = false;
                c = b;
            }
            count++;
            if(count%1000000==0){
                System.out.println("Attempt #"+count);
            }
        }
        System.out.println("Attempt: "+count);
        printTranspose(c);

    }
    public static int[][] makeSq(int n){
        int[][] a = new a[n][n];
        int top = 10;
        a[0][0]=(int)(top*Math.random());
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< a[i].length; j++){
                while()
                if()
            }
        }
    }
    //Lab 2

    //Lab 1
    public static int sums(int[][] a ){
        int sum = 0;
        for(int i = 0; i <a.length; i++){
            for(int j = 0; j<a[i].length-1; j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static int rowSum(int[][] a,int r){
        int sum = 0;
        for(int i = 0; i<a[r].length;i++){
          sum+=a[r][i];
        }
        return sum;
    }
    public static int sum(int[][] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=rowSum(a,i);
        }
        return sum;
    }
    public static int largest(int[][] a){
        int largest = a[0][0];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                if(a[i][j]>largest){
                    largest = a[i][j];
                }
            }
        }
        return largest;
    }
    public static int largestByRow(int[][] a,int r){
        int largest = a[r][0];
        for(int i = 0; i<a[r].length; i++){
            if(a[r][i]>largest){
                 largest = a[r][i];
            }
        }
        return largest;
    }
    public static int largest2(int[][] a){
        int largest = a[0][0];
        for(int i = 0; i<a.length; i++){
            largest = largestByRow(a,i);
        }
        return largest;
    }
    public static void printTranspose(int[][] a){
        int b = 0;
        for(int i = 0; i<a[b].length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
