import java.util.*;
public class dc10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] x=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            x[i]=arr[i];
        }
        Arrays.sort(x);
    
        if(Arrays.equals(arr, x))
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
    }
    

}
//        Arrays.sort(arr, Comparator.reverseOrder());



