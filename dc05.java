//program to split a number to two half a,b check a,b & num is a perfect square
import java.util.*;

public class dc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int l = n.length() / 2;
        String s1 = n.substring(0, l);
        long a = Long.parseLong(s1);
        String s2 = n.substring(l, n.length());
        long b = Long.parseLong(s2);
        long num = Long.parseLong(n);
        int x = sqrt(a);
        int y = sqrt(b);
        int z = sqrt(num);
        if (x == 1 && y == 1 && z == 1)
         {
            System.out.print("YES");
        } 
        else 
        {
            System.out.print("NO");
        }
    }

    public static int sqrt(long n) {
        int s = (int)Math.sqrt(n);
        return s * s == n ? 1 : 0;
    }
}
