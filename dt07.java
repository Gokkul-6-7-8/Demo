import java.util.*;

public class dt07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
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
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==0)
                {
                    while(i>=0)
                    {
                        System.out.print("0");
                        i--;
                    }
                    while(i<=row-1)
                    {
                        System.out.print("0");
                        i++;
                    }
                    

                }
            }
        }
    }
}
