package homework_nr5_1;

public class FourthTask {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int sumnum = 0;
        double average;

        System.out.println("For loop: ");
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = (double) sum / (array.length);
        System.out.println("The average of array is: " + average);
        System.out.println(" ");

        System.out.println("For each function: ");
        for (int j : array){
            sumnum += j;
        }
        average = (double) sumnum / (array.length);
        System.out.println("The average is: " + average);
        }
}
