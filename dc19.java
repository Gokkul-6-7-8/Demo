import java.util.Scanner;

public class dc19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char[] arr=new char[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<s.length();i++)
        {
            int a=Character.getNumericValue(s.charAt(i));
            System.out.print(arr[a]);
        }
    }
}
