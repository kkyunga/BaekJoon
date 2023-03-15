import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ulim = new int[9];
        int ulimscore = 0;
        int[] startlink = new int[9];
        int startlinkscore = 0;

        for (int i = 0; i < ulim.length; i++) {
            ulim[i] = scanner.nextInt();
        }
        for (int j = 0; j < ulim.length; j++) {
            ulimscore += ulim[j];

            if (ulimscore > startlinkscore) {
                System.out.println("Yes");
                break;
            }
            startlink[j] = scanner.nextInt();
            startlinkscore += startlink[j];
        }
        if (startlinkscore > ulimscore) {
            System.out.println("No");
        }
    }
}