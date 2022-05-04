import java.io.*;

class Sample
{
   public static boolean prime(int n)
    {
        if(n%2==0) return false;
        if(n<2) return false;
        for(int i=3;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
         return true;
    }
  public static  boolean palindrome(int n)
    {
        int t=n,s=0;
        while(t>0)
        {
         //if(t%10==0) 
         s=s*10+t%10;
         t/=10;
        }
        if(s==n) return true;
        else return false;
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=n+1;i>0;i++)
        {
            if(prime(i)==true){
                if(palindrome(i)==true){
                System.out.println(i);
                break;
                }
            }
        }
    }}