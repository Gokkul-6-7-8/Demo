import java.util.*;
import java.util.Scanner;
public class dc06
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int s=0;
             s=i*i;
            if(s<=n)
            {
                System.out.print(s+" ");
            }

        }
    }
}