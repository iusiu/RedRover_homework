package homework_nr5_1;

public class FirstTask {
    public static void main(String[] args){
        int[] array = {9,2,6,4,5,12,7,8,6};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The sum of array with for loop is: " + sum);

//        for(int j : array){
//            sum += j;
//        }
//        System.out.println("The sum of the array with for each function: " + sum);
    }
}
