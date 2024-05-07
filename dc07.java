//GET N AND X(INT) AN ARRAY IN SIZE OF N .COUNT THE MULTIPLES OF X AFTER THE FIRST OCCURENCE OF X
import java.util.*;
public class dc07 {
    public static void main(String[] args) {
        int temp=0;
        int count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==x)
        {
            temp++;
            for(int j=i;j<arr.length;j++)
            {
            if(arr[j]%x==0 && arr[j]>x && temp==1)
            {
                count++;
            }
            }
        }

    }
    System.out.print(count);
    }
}
