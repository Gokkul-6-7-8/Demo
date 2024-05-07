//The program must accept an integer N as the input. 
//The program must print the first N terms in the following series.
//The order of series must be 6, 120, 504, 1320 and so on.
//Test Case
//Input: 9 
//Output: 6 120 504 1320 2730 4896 7980 12144 17550
import java.util.*;
public class dt06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        long a=1,b=2,c=3;
        for(int i=1;i<=n;i++)
        {
            long temp=0;
            temp=a*b*c;
            System.out.print(temp+" ");
            a+=3;
            b+=3;
            c+=3;
        }
    }
}
