package homework_nr4_1;

public class SecondTask {
    public static void main(String[] args){
        int base = 5;
        int result = 1; //5^0 = 1

        for(int exponent = 0; result < 1000; exponent++){
            System.out.println("5^" + exponent + " = " + result);
            result *= base;
        }
    }
}
