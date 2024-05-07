//Program to check to half of a String is equal or not by removing a character in a string
//TEST CASE
//I/P: MEOME
//O/P:Yes
import java.util.*;
class dc31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<s.length();i++)
        {
            String str=s.substring(i,i+1)+s.substring(0,l/2);
            String str1=s.substring(l/2,l);
            if(str.equals(str1))
            {
                System.out.print("yes");
                System.exit(0);
            }
        }
        System.out.print("no");
    }
}