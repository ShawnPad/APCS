public class Lab4{
//Done 9/14/17
    public static void main(String[] args){
        System.out.println("The average of "+8+" and "+9+" is "+average(8,9));
        System.out.println("The slope of the line between "+"("+8+","+9+")"+" and "+"("+2+","+4+")"+" is "+ slope(8,9,2,4));
        System.out.println("The distance between"+"("+8+","+9+")"+" and "+"("+2+","+4+")"+" is "+distance(8,9,2,4));
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
}
