//The program must accept N string values as the input. The program must sort the N string values based on the number of consonants. If more than one string values have the same number of consonants then sort them in the order of their occurrence.
// Finally, the program must print the N modified string values as the output.

import java.util.*;

public class dc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                        ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
