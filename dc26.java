import java.util.Scanner;
//Input: 
//5 
//lion tiger elephant monkey leopard 
//Output: elephant tiger
public class dc26{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        int min=0,max=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
            String str=s[i];
            a=(int)str.charAt(0);
            System.out.print(a+" ");
        
        }
    

    }
}