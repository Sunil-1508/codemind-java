import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int sum=0,c=0;
        for(int i=l;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {   sum=0;
                for(int k=i;k<=j;k++)
                {
                   // System.out.print(k+" ");
                    sum+=k;
                }
                if(sum%2==1) c++;
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println(c);
        
    }
}