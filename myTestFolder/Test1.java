public class Test1{
    private static boolean balanceStatus;
    private static float balance;
    private static float cost1;
    private static float cost2;
    private static float cost3;
    private static float cost4;
    public static void main (String[] args){
        balance = -2;
        math();
        ui();
        System.out.println(5%6);

    }
    public static void ui(){
        System.out.println("$"+balance);
        if (balanceStatus == true){
            System.out.println("Spend More!");
        } else {
            System.out.println("Oh Noes!");
        }
        analysis();
    }
    public static void analysis(){
        System.out.println();
        System.out.println("Cost Analysis:");
        System.out.println("-$"+cost1);
        System.out.println("-$"+cost2);
        System.out.println("-$"+cost3);
    }
    public static void math(){
       balance = balance - cost1 - cost2 - cost3;
        if (balance > 0){
            balanceStatus = true;
        } else {
            balanceStatus = false;
        }
    }
}
