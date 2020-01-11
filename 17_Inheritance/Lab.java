import java.util.*;
public class Lab{
    //Done
    public static Scanner console = new Scanner(System.in);
    public static Student[] a = new Student[20];
    public static void main(String[] args) {
        for(int i = 0; i<a.length; i++){
            if(!(Math.random()<0.5)){
                a[i] = new Student();
            } else if(!(Math.random()<0.5)) {
                a[i] = new GradStudent();
            } else {
                a[i] = new UnderGrad();
            }
        }
        for(Student s: a){
            s.printWelcome();
            System.out.println("ID: #" + s.id);
            System.out.println();
        }
    }
}
