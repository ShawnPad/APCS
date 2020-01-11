public class Lab7{
//Done 9/12/17
    public static void main(String[] args){
        fourHeads();
        System.out.println();
        printTwoDigit(10,10,19);
    }
    public static void fourHeads(){
        int n=0;
        int count = 0;
        while(n<10){
            count++;
            if((int)(2*Math.random())==0){
                System.out.print("H ");
                n++;
            } else {
                System.out.print("T ");
                n=0;
            }
        }
        System.out.println();
        System.out.println(n+" Heads in a row in "+count+" trys!");
    }
    public static void printTwoDigit(int n,int min,int max){
        boolean z = false;
        int range = Math.abs(max - min) + 1;
        for(int i=1; i<=n; i++){
            int a = (int)(Math.random()*range+min);
            System.out.print(a+" ");
            if(a==13){
                z = true;
            }
        }
        System.out.println();
        if(z){
            System.out.println("We saw a 13!");
        } else {
            System.out.println("no 13 was seen.");
        }
    }
}
