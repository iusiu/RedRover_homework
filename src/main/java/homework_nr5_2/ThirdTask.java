package homework_nr5_2;

public class ThirdTask {
    public static void main(String[] args){
        int row = 10;
        for(int i = 0; i < row; i++){
            //The " "
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            //убывающая часть
            for(int k = row - 1 - i ; k >= 0; k--){
                System.out.print(k + " ");
            }
            //возрастающая часть
            for(int l = 1; l <= row - 1 - i; l++){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
