//SORT A 2D ARRAY
import java.util.*;

public class dc08 {
    public static void main(String[] args) {
        int n=0;
         Scanner sc=new Scanner(System.in);
         int row=sc.nextInt();
         int col=sc.nextInt();
         int[][] mat=new int[row][col];
         int[] arr=new int[row*col];
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
                arr[n]=mat[i][j];
                n++;
            }
         }
         Arrays.sort(arr);
         for(int i=0;i<row;i++)
         {
        if(i<col)
        {
            System.out.print(arr[i]+" ");
        }
            else
            {
                System.out.println("");
            }
        }
        
    }
}
