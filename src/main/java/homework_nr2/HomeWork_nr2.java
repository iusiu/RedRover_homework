package homework_nr2;

public class HomeWork_nr2 {

    public static void addition (int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    public static void subtract (int a, int b){
        int subtraction = a - b;
        System.out.println("The subtraction is: " + subtraction);
    }
    public static void multiply (int a, int b){
        int multiplication = a * b;
        System.out.println("The multiplication is: " + multiplication);
    }
    public static void divide (int a, int b){
        double division = (double) a / b;
        System.out.println("The division is: " + division);
    }
    public static void mod (double a){
        System.out.println("the mod is: " + a % 10);
    }

    public static void main (String[] args){
      addition(6,5);
      subtract(5,2);
      multiply(6,8);
      divide(14,2);
      mod(14.5);

    }

}
