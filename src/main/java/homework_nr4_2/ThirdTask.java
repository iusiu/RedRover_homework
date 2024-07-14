package homework_nr4_2;

public class ThirdTask {
    public static void main(String[] args){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("For loop: ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + 15 + ";");
        }

        System.out.println(" ");
        System.out.println("For each: ");

        for(int j : array){
            System.out.print(j + 15 + ";");
        }
    }
}
