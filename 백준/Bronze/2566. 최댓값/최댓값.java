import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];  // 9 x 9 의 형태로 배열 생성
        int max = 0;  // 최댓값
        int x = 0;  // 행
        int y = 0;  // 열

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();

                if (max < arr[i][j]) {  // 최댓값이 arr보다 작다면
                    max = arr[i][j];    // 최댓값에 arr 할당
                    x = i;  // x축(행)에 i 할당
                    y = j;  // y축(열)에 j 할당
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));  // 행,열은 1부터 시작하기 때문에 인덱스 + 1을 해준다.
    }
}