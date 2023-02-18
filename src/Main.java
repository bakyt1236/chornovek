import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int sum = 0;
        int counter = 0;
        int sum1 = 0;
        int counter1 = 0 ;
        int inde = 0;
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            array[inde] = number;
            if (array[inde] > 50) {
                sum += number;
                System.out.print(array[inde]+"  ");
                counter1++;
            } else if (array[inde] < 50) {
                sum1 += number;
                System.out.print(array[inde] + " ");
                counter++;
            } else
                System.out.println();
        }
        System.out.println("\n" + sum + "\n" + counter1 + "\n" + sum / counter1);
        System.out.println("\n" + sum1 + "\n" + counter + "\n" + sum1 / counter);
    }
}
