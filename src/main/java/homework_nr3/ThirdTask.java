package homework_nr3;

public class ThirdTask {
    public static void main(String[] args){
        int a = 120;
        if(a > 10){
            System.out.println("The number is bigger than 10");
        }
        if(a < 100){
            System.out.println("The number is smaller than 100");
        }
        if((a / 2) > 20){
            System.out.println("The division to 2 is bigger than 20");
        }
        if((a >= 5) && (a <= 40)){
            System.out.println("The number is between numbers 5 and 40");
        } else{
            System.out.println("The number is smaller than 5 or bigger than 40");
        }
    }
}
