//program to find 1st n value and last n value
import java.util.Scanner;

public class dc03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int k=sc.nextInt();
        int l=n.length();
        String s=n.substring(0,k);
        String s1=n.substring(l-k,l);
        System.out.print(s);
        System.out.print(s1);

    }
    
}
