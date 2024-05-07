import java.util.*;

public class dc24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=new char[30];
        int l=0;
        for(int i=0;i<s.length();i++)
        {

            if(isVowels(s.charAt(i)))
            {
                arr[l]=s.charAt(i);
                System.out.print(arr[l]);
                l++;
            }
            
        }
        Arrays.sort(arr);
        System.out.println(arr);
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            if(!isVowels(s.charAt(i)))
            {
                System.out.print(s.charAt(i));

            }
            else{
                System.out.print(arr[p]);
                p++;
            }
        }

    }
    public static boolean isVowels(char ch)
    {
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        else{
            return false;
        }
    }
}
