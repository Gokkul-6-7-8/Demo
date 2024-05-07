//program must accept a string S containing N lower case alphabets as the input. The program must sort all the alphabets in S in lexicographical order.
// Then the program must print the modified string S as the output.
//TEST CASE
//skillrack
//acikkllrs
import java.util.*;

public class dc35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] arr=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            arr[i]=a.charAt(i);
        }
        Arrays.sort(arr);
        System.out.print(arr);
    }
}
