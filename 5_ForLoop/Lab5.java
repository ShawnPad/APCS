public class Lab5{
//Done 9/20/17 Revisited 10/5/17
    public static void main(String[] args){
        multipleOf3(7,18);
        multiple4Not5(21);
        printList(2,7);
        printList(9,3);
    }
    public static void printList(int x, int y){
        if(x<=y){
            math(x,y,true);
        } else {
            math(y,x,false);
        }
    }
    public static void math(int a, int b,boolean z){
        for(int i = 1; b>=i;i++){
            if(i>=a&&i%2==0&&z){
                System.out.print(i+" ");
            }
            if(i>=a&&i%2==1&&!z){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void multipleOf3(int a, int b){
        for(int i = 0;i<=b;i++){
            if(i%3==0&&i>a){
            System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void multiple4Not5(int a){
        for(int i = 0;i<=a;i++){
            if (!(i%5==0) && i%4==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Lab5{
//Done 9/20/17
    public static void main(String[] args){
        multipleOf3(7,18);
        multiple4Not5(21);
        printList(2,7);
        printList(9,3);
    }
    public static void printList(int x, int y){
        if(x<=y){
            mathS(x,y);
        } else {
            mathS(y,x);
        }
    }
    public static void mathS(int a, int b){
        System.out.print(a+" ");
        int z = b/a;
        int y = b%a;
        if(y!=0){
            z = z - 1;
        }
        for (int i = 1; i<=z; i++){
            a = a + 2;
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void multipleOf3(int a, int b){
        if(a%3==0){
            System.out.print(a+" ");
        }
        int y = 0;
        for(int i = 0;y<=b;i++){
            y = y+3;
            if(y>=a && y<=b){
            System.out.print(y+" ");
            }
        }
        System.out.println();
    }
    public static void multiple4Not5(int a){
        int y = 0;
        for(int i = 0;y<=a;i++){
            y = y+4;
            if (!(y%5==0) && y<=a){
                System.out.print(y+" ");
            }
        }
        System.out.println();
    }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Lab5{
//Done 9/20/17 Revisited 10/5/17
    public static void main(String[] args){
        multipleOf3(7,18);
        multiple4Not5(21);
        printList(2,7);
        printList(9,3);
    }
    public static void printList(int x, int y){
        if(x<=y){
            math(x,y,0);
        } else {
            math(y,x,1);
        }
    }
    public static void math(int a, int b,int z){
        for(int i = 1; b>z;i++){
            z+=2;
            if(z>=a&&z<=b){
                System.out.print(z+" ");
            }
        }
        System.out.println();
    }
    public static void multipleOf3(int a, int b){
        for(int i = 0;i<=b;i++){
            if(i%3==0&&i>a){
            System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void multiple4Not5(int a){
        for(int i = 0;i<=a;i++){
            if (!(i%5==0) && i%4==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
*/