import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        while (true) {
            if (N % 5 == 0) {
                count = count + (N / 5);
                System.out.println(count);
                break;
            }
            else {
                N -= 3;
                count++;
            }
            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}