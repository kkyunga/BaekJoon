import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int count = 0;
        int next = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == next && next == 0) {
                next = 1;
                count++;
                continue;
            }
            if (arr[i] == next && next == 1) {
                next = 2;
                count++;
                continue;
            }
            if (arr[i] == next && next == 2) {
                next = 0;
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}