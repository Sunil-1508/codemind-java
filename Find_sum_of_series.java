import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        float sum=0;
        for(int i=1;i<=n;i++){
        float c = (float) 1/i;
        sum+=c;
         }
         System.out.printf("%.2f",sum);
        
    }
}