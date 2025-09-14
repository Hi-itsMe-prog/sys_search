import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxR = -1;

        for (int i = 0; i < n; i++) {
            int current = numbers[i];


            if (current % 14 == 0) {

                for (int j = 0; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (numbers[j] * numbers[k] == current && j != i && k != i) {
                            if (current > maxR) {
                                maxR = current;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxR);

        scanner.close();
    }
}