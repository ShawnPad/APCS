public class Circle{
    double x;
    double y;
    double radius;
    String color;
    public Circle(){
        x = 0;
        y = 0;
        radius = 1;
        color = "Purple";
    }
    public Circle(double a, double b, double r){
        x = a;
        y = b;
        radius = r;
        color = "Purple";
    }
    public Circle(double a, double b, double r, String c){
        x = a;
        y = b;
        radius = r;
        color = c;
    }
    public void printProp(){
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        System.out.println("Radius: "+radius);
        System.out.println("Color: "+color);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public boolean isOnCircle(double a, double b){
        return distanceToCenter(a,b)<=radius;
    }
    public boolean isOnCircle(Point a){
        return distanceToCenter(a.x,a.y)<=radius;
    }
    public void setColor(String str){
        color=str;
    }
    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }
    public void doubleRadius(){
        radius*=2;
    }
    public double distanceToCenter(double x1, double y1){
        return Math.sqrt((x1-x)*(x1-x)+(y1-x)*(y1-x));
    }
}