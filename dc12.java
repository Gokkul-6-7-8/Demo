//accepts an integer array arr and its size N as the input. 
//The function must modify the integer array arr by replacing each integer X by adding with its previous integer. 
//The first integer in the array arr has no integers on its left side, so it remains the same.

//Test Case
//Input: 5 10 20 30 40 50 
//Output: Array: 10 30 50 70 90

import java.util.Scanner;
public class dc12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int temp=0;
            if(i==0)
            {
            System.out.print(arr[0]+" ");
            }
            else
            {
                temp=arr[i]+arr[i-1];
                System.out.print(temp+" ");
                }
                 }
}
}
