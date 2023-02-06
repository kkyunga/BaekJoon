import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        int max = 0;

        while (scanner.hasNextLine()) {
            String eng = scanner.nextLine();
            for (int i = 0; i < eng.length(); i++) {
                if (eng.charAt(i) >= 'a' && eng.charAt(i) <= 'z') {
                    arr[eng.charAt(i) - 'a']++;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max == arr[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}