//The program must accept N integers and an integer X as the input. The program must print all 
//the integers such that the integer in the Xth position is 
//always maximum and the remaining integers are printed in descending order as the output.
import java.util.*;

public class dc22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt(); }
        Arrays.sort(arr);
        int p=0;
        for(int i=n-1;i>=0;i--)
        {arr1[p]=arr[i];
            p++; }
        for(int i=0;i<n;i++)
        {
            if(i>0)
            {
                System.out.print(arr1[i]+" ");
            }
            if(i==x-1)
            {
                System.out.print(arr1[0]+" ");
            }
        }
        
    }
}
