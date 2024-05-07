//The program accepts N integers and prints the integers which are having at least three distinct digits. 
//If there is no such integer,
// the program must print -1 as the output.
//Input: 5 488 978 1432 151 5070 
//Output: 978 1432 5070
import java.util.*;
import java.util.Scanner;

class dc17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            String num=Integer.toString(arr[i]);
            int l=num.length();
            int a=Integer.parseInt(num);
            while(a>0)
            {
                int lastdigit=a%10;
                a/=10;
                String x=Integer.toString(lastdigit);
                String y=Integer.toString(a);
                
            }
        }
    }
}