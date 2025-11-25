import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        StringBuilder sb = new StringBuilder();

        int max = Math.max(a.length(), Math.max(b.length(), c.length()));

        for(int i=0; i<max; i++){
            if(i < a.length()) sb.append(a.charAt(i));
            if(i < b.length()) sb.append(b.charAt(i));
            if(i < c.length()) sb.append(c.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
