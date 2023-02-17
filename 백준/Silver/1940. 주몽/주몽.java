import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}