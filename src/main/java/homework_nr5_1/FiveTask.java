package homework_nr5_1;

public class FiveTask {
    public static void main(String [] args){
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int sum = 0;
        int sumarray = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++ ){
                sum += array[i][j];
            }
        }
        System.out.println("The sum of array is: " + sum);

        for(int[] k : array){
            for (int l = 0; l < k.length; l++ ){
                sumarray += k[l];
            }
        }
        System.out.println("The sum of array elements is: " + sumarray);
    }
}
