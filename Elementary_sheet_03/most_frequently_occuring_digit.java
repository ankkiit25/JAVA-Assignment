import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int freq[] = new int[10];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            num = Math.abs(num);
            while (num > 0) {
                freq[num % 10]++;
                num /= 10;
            }
        }

        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        System.out.println(digit);
    }
}
