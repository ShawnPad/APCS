public class BMI{
    public static void main(String[] args){
        bmiPrint(70.0,194.25);
        System.out.println();
        bmiPrint(62.5,130.5);
    }
    public static void bmiPrint(double h, double w){
        System.out.println("Height (in): "+h);
        System.out.println("Weight (lb): "+w);
        double z = bmiCalc(h,w);
        System.out.println("BMI = "+z);
        System.out.println(weightClass(z));
    }
    public static double bmiCalc(double h,double w){
        return (w/(h*h))*703;

    }
    public static String weightClass(double x){
        if(x<18.5){
            return "Underweight";
        } else if(x<25){
            return "Normal";
        } else if(x<30){
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}