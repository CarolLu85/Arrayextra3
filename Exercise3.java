import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[5];
        for (int i = 0; i < 5; i++){
            number[i] = random.nextInt(20) + 1;
            for (int a = 0; a < 7; a++){
                if(number[i] == number[a]){
                    break;
                }
            }
        }
    for (int b = 0; b < 5; b++){
        System.out.print(number[b]);
    }    

    }   
}
