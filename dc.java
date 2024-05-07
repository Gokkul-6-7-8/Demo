import java.util.*;
public class dc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int odd=0,even=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                odd+=arr[i];
            }
            else{
                even+=arr[i];
            }
        }
        System.out.print(odd%even);
    }
}
