//The program must accept two integer arrays of size N and print 1 if the two arrays are mirror images
// (reverse of another array) of each other. 
//Else the program must print 0.

import java.util.*;

class dc13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] arr3=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
            
        }
        for (int i = 0; i <n; i++) {
            arr2[i]=sc.nextInt();
        }
        // Copy arr1 in reverse to arr3
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr3[p] = arr1[i];
            p++;
        
        }
        if(Arrays.equals(arr3, arr2))
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }
}