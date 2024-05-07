import java.util.*;

class dc39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] strings = new String[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            String str = strings[i].toLowerCase();
            if (hasVowel(str)) {
                c++;
            }
        }
        if (c == n) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }

    public static boolean hasVowel(String str) {
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false; 
    }
}
