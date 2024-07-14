package homework_nr5_1;

public class ThirdTask {
    public static void main(String[] args){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        int minimum = array[0];
        int minvalue = array[0];
        int minumber = array[0];

        System.out.println("For loop: ");

        for(int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("The minimum value is: " + min);

        for(int k = 0; k < array.length; k++){
            minvalue = Math.min(minvalue,array[k]);
        }
        System.out.println("The minimum value is: " + minvalue);
        System.out.println(" ");
        System.out.println("For each function: ");

        for(int j : array){
            if (minimum > j){
                minimum = j;
            }
        }
        System.out.println("The minimum value is: " + minimum);

        for(int h : array){
           minumber = Math.min(minumber, h);
        }
        System.out.println("The minimum value is: " + minumber);
    }
}
