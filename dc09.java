//Program to swap adjacent word of w
import java.util.Scanner;

public class dc09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String temp="";
        String str=sc.nextLine();
        String w=sc.nextLine();
        String[] s=str.split(" ");
        for(int i=1;i<s.length-1;i++)
        {
            if(s[i].equals(w))
            {
                temp=s[i+1];
                s[i+1]=s[i-1];
                s[i-1]=temp;
            }
        }
        for(String v:s)
        {
            System.out.print(v+" ");
        }
    }
}
