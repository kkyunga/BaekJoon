import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 0;
        char[][] tile = new char[N][M];
        for (int i = 0; i < N; i++) {
           String str = scanner.next();
           for (int j = 0; j < M; j++) {
               tile[i][j] = str.charAt(j);
           }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tile[i][j] == '-') {
                    if ( j == M-1 || tile[i][j+1] == '|') {
                        total++;
                    }
                }
                if (tile[i][j] == '|') {
                    if (i == N-1 || tile[i+1][j] == '-') {
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}