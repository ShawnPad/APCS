public class Lab3{
//Done 9/14/17
    private static int test1;
    private static int test2;
    private static int test3;
    private static double average;
    private static double variance;
    private static double standardDeviation;
    public static void main(String[] args){
        test1 = 78;
        test2 = 82;
        test3 = 89;
        math();
        System.out.println("The test scores are: " +test1+", "+test2+", "+test3+".");
        System.out.println("The average of the scores is: "+ average);
        System.out.println("The variance is: "+ variance);
        System.out.println("The standard deviation is: "+standardDeviation);
    }
    public static void math(){
        average = (test1+test2+test3)/3.0;
        double d1 = test1-average;
        double d2 = test2-average;
        double d3 = test3-average;
        variance = (d1*d1+d2*d2+d3*d3)/3.0;
        standardDeviation = Math.sqrt(variance);

    }
}
