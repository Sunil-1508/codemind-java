import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {   sum=0;
                for(int k=i;k<=j;k++)
                {
                    //System.out.print(a[k]+" ");
                    sum+=a[k];
                }
                if(sum==p) c++;
               // System.out.println();
            }
           // System.out.println();
        }
        System.out.println(c);
        
    }
}