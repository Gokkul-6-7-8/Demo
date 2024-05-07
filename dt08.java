import java.util.*;
public class dt08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // String s=str.toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(isConsanants(s.charAt(i)))
            {
                c++;
                if(c==1)
                {
                    System.out.print("["+s.charAt(i));
                }
                if(!isConsanants(s.charAt(i+1)))
                {
                    System.out.print(s.charAt(i)+"]");
                }
            }
            if(!isConsanants(s.charAt(i)))
            {
                System.out.print(s.charAt(i)+"[");
                if(i!=s.length()-1)
                {
                    System.out.print("[");
                }
                
            }
        }

    }
    public static boolean isConsanants(char ch)
    {
        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'&& ch!='A'
         && ch!='E' && ch!='I' && ch!='O' && ch!='U' )
        {
            return true;
        }
        else{
            return false;
        }
    }
}
