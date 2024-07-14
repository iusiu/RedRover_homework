package homework_nr5_1;

public class SixthTask {
    public static void main(String[] args){
        int[][] array = {{1,2,3,4,5},{6,7,8,9},{-1,-2,-3,4},{-5,-6}};
        int max = 0;
        int maximum = 0;
        //for loop
        for(int i = 0; i < array.length; i++){
            for (int k = 0; k < array[i].length; k++){
                if (max < array[i][k]){
                    max = array[i][k];
                }
            }
        }
        System.out.println("The maximum number of the array is: " + max);
        //foreach
        System.out.println("-------------------");
        for(int[] j : array){
            for(int l = 0; l < j.length; l++){
                if(maximum < j[l]){
                    maximum = j[l];
                }
            }
        }
        System.out.println("The biggest number of the array is: " + maximum);
    }
}
