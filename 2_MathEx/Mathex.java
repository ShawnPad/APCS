public class Mathex{
//Done 9/13/17
    /*This program counts how many muffins you have after eating a few, buying more,
    and calculates how many you can share with your friends.*/

    //the variables
    private static int count1;
    private static int count2;
    private static int count3;
    private static int friendCount;
    private static int muffinStartCount;
    private static float count4;
    private static float count5;
    private static String muffinNumber;
    private static boolean perfect;

    public static void main(String[] args){
        //starting variables
        muffinStartCount = 7;
        friendCount = 4;
        perfect = true;
        printMath();
        System.out.println();
        printCat();

    }
    public static void printMath(){
        //the math
        count1 = muffinStartCount+7;
        count2 = count1-2;
        count3 = count2*5;
        count4 = count3/friendCount;
        count5 = count3%friendCount;
        //printing of the maths
        System.out.println("Calculating beep boop");
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count5+count4);

    }
    public static void printCat(){
        //some code to make the remainder line nice and english :D
        if (count5 > 1){
            muffinNumber = "muffins";
        } else if (count5 == 1){
            muffinNumber = "muffin";
        } else if (count5 == 0){
            perfect = false;
        }
        //printing the result
        System.out.println("You started with: " + muffinStartCount);
        System.out.println("You now have: "+count3+" muffins");
        System.out.println("You can share "+count4+ " muffins to each of "+ (friendCount-1) + " friends!");
        if (perfect){
            System.out.println("And you will have "+count5+ " " + muffinNumber +" left over.");
        } else {
            System.out.println("And you have no muffins left over!");
        }
        System.out.print("Happy"+" Eating!");
        System.out.println();
    }
}
