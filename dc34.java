//Program to find the max continous 1 in a binaryvalue.
//TEST CASE:
//10110111
//O/P:3
import java.util.*;

public class dc34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int count=0,max=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
                max=Math.max(count,max);
            }
            if(s.charAt(i)=='0')
            {
                count=0;
                continue;
            }
        }
        System.out.print(max);
    }
}
