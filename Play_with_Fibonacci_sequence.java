import java.io.*;

class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a=0,b=1,t;
        for(int i=0;i<n;i++)
        { 
        System.out.print(a+" ");
        t=a+b;
        a=b;
        b=t;
        
        
            
        }
    }}