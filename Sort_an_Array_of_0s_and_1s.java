import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int i=0;
        int j=n-1;
        while(i<j)
        {
           if(a[i]==1&&a[j]==0)
           {
               int t=a[i];
               a[i]=a[j];
               a[j]=t;
               j--;
           }
           if(a[i]==0) i++;
           if(a[j]==1)  j--;
        }
        for(int p:a)
        System.out.print(p+" ");
        
        
    }
}