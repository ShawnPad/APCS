4a super(x,y)
4b
class Rectangle extends Shape{
    private int length,width;
    rectangle(int x, int y,int l, int w){
        super(x,y);
        length = l;
        width = w
    }
    double area(){
        return length*width;
    }
4c
static double sumArea(int[] a){
    int g,s;
    g = a[0].area;
    s = g;
    for(int i = 0; i<a.length; i++){
        if(g<a[i].area){
            g = a[i].area;
        }
        if(s>a[i].area){
            s = a[i].area;
        }
    }
    return s + g;
}