import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int sum=(n*(n+1))/2;
        System.out.println(sum);
       
        
        
    }
}