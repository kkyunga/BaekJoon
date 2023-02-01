import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            result.add(queue.poll());
        }
        String str = String.valueOf(result);
        str = str.replace("[","<")
                        .replace("]", ">");
        System.out.println(str);
    }
}