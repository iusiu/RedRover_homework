package homework_nr5_2;

public class SecondTask {
    public static void main(String[] args){
        int row = 10;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < row - i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
