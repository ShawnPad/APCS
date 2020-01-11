public class Test2{
    public static void main(String[] args){
        printMath(8,9,2,4);
    }
    public static void printMath(int x,int y,int a,int b){
        System.out.println("The average of "+x+" and "+y+" is "+average(x,y));
        System.out.println("The slope of the line between "+point(x,y)+" and "+point(a,b)+" is "+ slope(x,y,a,b));
        System.out.println("The distance between"+point(x,y)+" and "+point(a,b)+" is "+distance(x,y,a,b));
    }
    public static double average(int x,int y){
        return (x+y)/2.0;
    }
    public static double slope(int x1,int y1,int x2,int y2){
        double dy = difference(y2,y1);
        double dx = difference(x2,x1);
        return dy/dx;
    }
    public static int difference(int x,int y){
        return x-y;
    }
    public static int square(int x){
        return x*x;
    }
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt((square(difference(x2,x1))+square(difference(y2,y1))));
    }
    public static String point(int g,int h){
        return "("+g+","+h+")";
    }
}