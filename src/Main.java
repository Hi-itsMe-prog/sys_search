import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int R = -1;

        int[] arr = new int[14];
        for (int i = 0; i < 14; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            int s = num % 14;
            if (num > arr[s]) {
                arr[s] = num;
            }

            for (int j = 0; j < 14; j++) {
                if (arr[j] != -1 && arr[j] != num) {
                    int pr = num * arr[j];
                    if (pr % 14 == 0 && pr > R) {
                        R = pr;
                    }
                }
            }
        }

        System.out.println(R);
        scanner.close();
    }
}