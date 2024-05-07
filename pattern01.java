class pattern01{
    public static void main(String[] args) {
        int n=7;
        int t1=n,t2=n+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n*2;j++)
            {
                if(j>=t1 && j<=t2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            t1--;
            t2++;
            System.out.println("");
        }
    }
}