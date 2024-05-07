//The program must accept N integers and print the integers which are equal to their index value as the output.
// If there is no such integer,
// the program must print -1 as the output.
import java.util.*;
public class dc28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i==arr[i])
            {
                System.out.print(arr[i]+" ");
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
    
}
