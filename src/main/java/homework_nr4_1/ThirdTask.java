package homework_nr4_1;

public class ThirdTask {
    public static void main(String[] args){
        for(int i = 40; i <= 60; i++){
            if(i % 4 == 0){
                System.out.println(i);
            }
        }

        System.out.println("The statement without if condition: ");

        for(int num = 40; num <= 60; num = num + 3){
            System.out.println(num);
        }
    }
}
