import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        String line = br.readLine();

        int count = 1;
        for (int i = 0; i < num; i++) {
            char person = line.charAt(i);

            if (person == 'S') {
                count++;
            }
            else if (person == 'L') {
                count++;
                i++;
            }
        }
        if (count > num) {
            System.out.println(num);
        }
        else System.out.println(count);
    }
}