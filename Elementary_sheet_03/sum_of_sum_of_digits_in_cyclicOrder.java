import java.util.*;

public class Main {
    static int digitSum(String s){
        int sum = 0;
        for(char c : s.toCharArray()) sum += c - '0';
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            total += digitSum(rotated);
        }

        System.out.println(total);
    }
}
