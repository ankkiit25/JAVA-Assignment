import java.util.*;

public class Main {
    static boolean canForm(String word, String chars){
        int freq[] = new int[26];
        for(char c : chars.toCharArray()) freq[c-'a']++;

        for(char c : word.toCharArray()){
            if(--freq[c-'a'] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chars = sc.next();
        int n = sc.nextInt();

        while(n-- > 0){
            String word = sc.next();
            if(canForm(word, chars))
                System.out.println(word);
        }
    }
}
