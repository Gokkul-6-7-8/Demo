//The order of the series must be 2, 5, 10, 17, 26, 37, 50, 65,... and so on.
//Input: 5
//Output: 2 5 10 17 26
import java.util.*;
public class dc18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
        int tt=1;
        for(int i=0;i<n;i++)
        {
            t=t+tt;
            System.out.print(t+" ");
            tt+=2;
        }
    }
}
