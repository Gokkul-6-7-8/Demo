public class dc37 {
    public static void main(String[] )
    {
        int row=sc.nextInt();
        int col=sc.nextInt();
        int k=sc.nextInt();
        int[][]mat=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i==0 || i==row-1 || j==0 || j==col-1) && mat[i][j]==k)
                {
                        c++;
                }
            }
        }
        System.out.print(c);

    }
}
