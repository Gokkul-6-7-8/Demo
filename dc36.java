import java.util.*;

 class dc36{
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
        int count=0,max=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
                if(j==col-1)
                {
                    max=Math.max(count,max);
                    count=0;
                }
            }
        }
        System.out.print(max);
    }
}