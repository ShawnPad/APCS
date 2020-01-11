public class Point{
    int x;
    int y;

    public Point(int intX, int intY){
        x=intX;
        y=intY;
    }
    public Point(){
        x=0;
        y=0;
    }
    public void printPoint(){
        System.out.println("("+x+","+y+")");
    }
    public double distance(Point other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }
}