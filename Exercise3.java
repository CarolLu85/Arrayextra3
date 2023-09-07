import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[5];
        int picked_number = 0;
        int index = 0;
        while (index < 5) {
            boolean same_number = false;
            picked_number = random.nextInt(20) + 1;
            for (int i = 0; i < index; i++) {
                if (picked_number == number[i]) {
                    same_number = true;
                    break;
                }   
            }
            if (same_number == false){
                number[index] = picked_number;
                index = index + 1;
            }
        }
        for (int b = 0; b < 5; b++) {
        System.out.println(number[b]);
        }
    }
}
