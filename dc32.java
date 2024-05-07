import java.util.Scanner;

public class dc32 {

    //The program must accept an integer N as the input. 
    //The program must find the sum of digits S and the product of digits P in N. 
    //Then the program must print yes if the sum of S and P is equal to N.
    // Else the program must print no as the output.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n;
        int p=0,a=0,b=1;
        while(n>0)
        {
            a=n%10;
            p=p+a;
            b*=a;
            n=n/10;
        }
    if((p+b)==res)
    {
        System.out.print("yes");
    }
    else
    {
        System.out.print("no");
    }
    }
}
