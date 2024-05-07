import java.util.*;
public class dc30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i-j==Math.abs(n-1))
                {
                    System.out.print("*");
                }
                if(i-j==0 )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print("|");
                }
                
            }
            System.out.println("");
        }

    }
}
