//The program must accept an integer N as the input. The program must print yes 
//if exactly three digits are used to form the integer N.
// Else the program must print no as the output.
//TEST CASE
//I/P:1221255
// O/P:yes
import java.util.*;

public class dc27{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String res="";
        for(int i=0;i<n.length();i++)
        {
            String ch= ""+n.charAt(i);
            if(res.contains(ch))
            {
                continue;
            }
            res+=ch;
        }
        if(res.length()==3)
        {
        System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}