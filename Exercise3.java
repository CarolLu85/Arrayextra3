import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[5];
        boolean same_number = false;
        int picked_number = 0;
        int index = 0;
        while (true) {
            picked_number = random.nextInt(20) + 1;
            for (int i = 0; i <= index; i++) {
                if (picked_number == number[i]) {
                    same_number = true;
                    break;
                } else {
                    number[index] = picked_number;
                }
            }
            index = index + 1;
            if (index == 5) {
                break;
            }
        }
        for (int b = 0; b < 5; b++) {
        System.out.println(number[b]);
        }
    }
}
