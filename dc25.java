//The program must accept a string S containing multiple words as the input. 
//The program must reverse every word in the string S. 
//Then the program must print the modified string S as the output.

//TEST CASE
// I/P:Friday and saturday
// O/P:yadirF dna yadrutas 
import java.util.*;
public class dc25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int l=str.length;
        for(int i=0;i<l;i++)
        {
            String s1=str[i];
            StringBuilder sb=new StringBuilder(s1);
            sb.reverse();
            sb.toString();
            System.out.print(sb+" ");
        }

    }
}
