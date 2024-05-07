import java.util.*;

public class dc20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="bookkeeping";
        StringBuilder sb=new StringBuilder(s);
         
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i+1);
            }
        }
        
        System.out.println(s); 
    }
}
