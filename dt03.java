import java.util.*;
public class dt03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //char[] arr=str.toCharArray();
       int l=s.length(),i=0,max=0;
       String fin="";
       while(i<l)
       {
        int c=i;
            if((int)s.charAt(i)<97)
            {
                for(int j=i+1;j<l;j++)
                {
                    if((int)s.charAt(j)>=97)
                    {
                        c=j;
                    }
                    else{
                        break;
                    }
                }
                String temp=s.substring(i,c+1);
                if(temp.length()>max)
                {
                    fin = temp;
                    max=temp.length();
                }
                
            }
       }
    }
}
