//The program must accept an integer .The program must print the number of ways 
//to represent sum of two prime integer
import java.util.*;

public class dc33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPrime(i) && isPrime(j))
                {
                    if(i+j==n)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
