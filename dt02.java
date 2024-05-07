import java.util.*;

public class dt02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[] arr=new int[row];
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            int result=0;
            int power=0;
            for(int j=col-1;j>=0;j--)
            {

                result+=mat[i][j] * Math.pow(2,power);
                power++;
                
            }
            arr[i]=result;
            System.out.println("");
        }
        Arrays.sort(arr);
        for(int i=0;i<row;i++)
        {
            String s="";
            while(arr[i]>0)
            {
                s+=Integer.toString(arr[i]%2);
                arr[i]/=2;
            }
            if(s.length()<(col))
            {
                s=s+"0".repeat(col-s.length());
            }
            StringBuilder sb=new StringBuilder(s);
            sb=sb.reverse();
            System.out.println(sb.toString().replaceAll(".(?!$)", "$0 "));
        }
    }
}
