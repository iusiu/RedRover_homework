package homework_nr5_1;

public class SecondTask {
    public static void main(String[] args){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array [0];
        int maximum = array [0];
        int maxnum = array [0];
        int maxnumber = array[0];

        System.out.println("For loop: ");
        for (int i = 0; i < array.length; i++){
            max = Math.max(max, array[i]);
        }
        System.out.println("The maximum number is: " + max);

        for (int k = 0; k < array.length; k++){
            if (maximum < array[k]){
                maximum = array[k];
            }
        }
        System.out.println("The maximum number is: " + maximum);

        for(int j : array){
            maxnum = Math.max(maxnum, j);
        }
        System.out.println("For each: ");
        System.out.println("The maximum number is: " + maxnum);

        for(int l : array){
            if (maxnumber < l){
                maxnumber = l;
            }
        }
        System.out.println("The maximum number is: " + maxnumber);
    }
}
