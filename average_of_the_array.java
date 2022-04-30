import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,l=0,count=0;
        float k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            count=count+a[i];
        }
        //k=sc.nextInt();
        k=(float)count/n;

       System.out.format("%.2f",k); 
    
      
       
       
        
    }
}