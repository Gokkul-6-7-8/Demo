import java.util.*;

class dc38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        int a=arr[0];
        for(int i=1;i<n-1;i++)
        {
            if(s.charAt(i-1)=='+')
            {
                a=a+arr[i]+;
            }
            if(s.charAt(i-1)=='-')
            {
                a=a-arr[i];
            }
            if(s.charAt(i-1)=='*')
            {
                a=a*arr[i];
            }
            if(s.charAt(i-1)=="/")
            {
                a=a/arr[i];
            }

        }
        System.out.print(a);
    }
}
