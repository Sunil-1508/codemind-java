import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
        String s=br.readLine();
        String a[]=s.split(" ");
        int m=Integer.parseInt(a[0]);
        int n=Integer.parseInt(a[1]);
        int c=0;
        for(int i=m;i<=n;i++){
        int last=i%10;
        if(last==2||last==3||last==9)
         c++;
        }
         System.out.println(c);
        }
        
    }
}