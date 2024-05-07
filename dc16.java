import java.util.Scanner;

public class dc16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int facta=1;
        int answer=0;
        for(int i=a;i>0;i--)
        {
            facta*=i;
        }
       // System.out.println(facta);

        int factb=1;
        for(int i=b;i>0;i--)
        {
            factb*=i;
        }
       // System.out.println(factb);
        answer=facta/factb;
        System.out.print(answer);
    }
}
