import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int money = scanner.nextInt();

            int quota = money / 25;
            int daim = (money - quota * 25) / 10;
            int nickel = (money - quota * 25 - daim * 10) / 5;
            int penny = money - quota * 25 - daim * 10 - nickel * 5;

            System.out.printf("%d %d %d %d", quota, daim, nickel, penny);
            System.out.println();
        }
    }
}