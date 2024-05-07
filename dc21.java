import java.util.Scanner;

public class dc21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //i am a boy
        str=str.toLowerCase();
        String[] s=str.split(" ");
        String a="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++)
        {
           String d=Character.toString(str.charAt(i));
           a=a.replaceAll(d, "");
        }
        System.out.print(a);
    }
}
