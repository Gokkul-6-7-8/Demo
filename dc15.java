//The program must accept a string S as the input.
// The program must print the first character and then the third character and then the sixth character and 
//so on from the end as the output.

//Input: abcdefghijklmno 
//Output: omjfa
import java.util.*;

public class dc15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=2;
        String str=sc.nextLine();
        int l=str.length()-1;
       // StringBuilder sb=new StringBuilder();

        while(l>=0)
        {
         System.out.print(str.charAt(l));
            l=l-n;
            n++;
        }
    }
}
