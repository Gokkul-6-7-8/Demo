import java.util.*;
public class dc23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            res+=(int)str.charAt(i);
        }
        System.out.print(res);
    }
}