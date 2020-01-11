public class Test{
    public static void main(String[] args) {
        int i1 =10345435;
        String s =new StringBuilder(String.valueOf(i1)).toString();
        char a[]=s.toCharArray();
        int sum = 0;
        for(char c : a) {
            Integer i = Integer.parseInt(c+"");
            sum = sum + i;
        }
        System.out.println(sum);
    }
}