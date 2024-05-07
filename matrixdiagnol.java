import java.util.*;
class matrixdiagnol {
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
        int sum=0,res=0;
         for(int i=0;i<row;i++)
        {
            
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                sum+=mat[i][j];
                }
                if(i+j==row-1)
                {
                    res+=mat[i][j];
                }
            }
        }
        System.out.println("Sum of 1st Diagonal value"+sum);
        System.out.print("Sum of 2nd Diagonal value"+res);
        
    }
}