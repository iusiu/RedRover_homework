package homework_nr4_2;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("The result with for loop: ");
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
        System.out.println("The result with for each function: ");
        for (int k : array) {
            if (k % 2 != 0) {
                System.out.println(k);
            }
        }
    }
}
