package homework_nr4_2;

public class SecondTask {
    public static void main(String[] args){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("The result with for loop: ");

        for(int i = 0; i < array.length; i++){
            if(array[i] > 5){
                System.out.println(array[i]);
            }
        }

        System.out.println("The result with foreach function: ");
        for (int j : array) {
            if (j > 5){
                System.out.println(j);
            }
        }
    }
}
