import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxR = -1;

        int[] maxByRemainder = new int[14];
        for (int i = 0; i < 14; i++) {
            maxByRemainder[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            int remainder = num % 14;
            if (num > maxByRemainder[remainder]) {
                maxByRemainder[remainder] = num;
            }

            for (int j = 0; j < 14; j++) {
                if (maxByRemainder[j] != -1 && maxByRemainder[j] != num) {
                    int product = num * maxByRemainder[j];
                    if (product % 14 == 0 && product > maxR) {
                        maxR = product;
                    }
                }
            }
        }

        System.out.println(maxR);
        scanner.close();
    }
}