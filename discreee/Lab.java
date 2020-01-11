import java.util.*;
public class Lab{
    //Done
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

    }
    void set(){
        int count = 0;
        for(int i = 2; i<=350; i++){
            if(i%2==0||i%5==0||i%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
    void cypfr(){
        char[] a = "e|juczehrey|tebia|puju|xer|ercijressej".toCharArray();
        char[] b = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String c = "";
         for(int j = 0; j< a.length; j++){
                            if (a[j]=='|'){
                    System.out.print(" ");
                    c+=" ";
                }
            for(int i = 0; i< b.length; i++){
                    if(a[j]==b[i]){
                    if(i-4<0){
                        System.out.print((((i-4)*23)%26)+26+",");
                        c+=b[(((i-4)*23)%26)+26];
                    } else {
                        System.out.print(((i-4)*23)%26+",");
                        c+=b[(((i-4)*23)%26)];
                    }
                }
            }
        }
        System.out.println();
        System.out.println(c);
    }

}
