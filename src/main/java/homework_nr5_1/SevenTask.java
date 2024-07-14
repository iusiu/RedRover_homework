package homework_nr5_1;

public class SevenTask {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int length = 0;
        int elementCount = 0;

        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }
        System.out.println("the length of array is: " + length);

        //foreach
        for(int j[] : array){
            elementCount += j.length;
        }
        System.out.println("----------------");
        System.out.println("The count of array element is: " + elementCount);
    }
}

