//The program must accept an integer N as the input. The program must print the sum 
//of each digit to the power of number of digits in N as the output

import java.util.*;
public class dt04 {
    public static void main(String[] args) {
        int res=0;
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            int num=Character.getNumericValue(n.charAt(i));
            res+=Math.pow(num,l);
        }
        System.out.print(res);
    }
}
