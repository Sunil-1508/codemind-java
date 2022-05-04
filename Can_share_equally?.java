import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String a[]=s.split(" ");
        int x=Integer.parseInt(a[0]);
        int y=Integer.parseInt(a[1]);
       // System.out.println("x="+x+" "+"y="+y);
       
        if(x%2!=0&&x!=0) System.out.println("NO");
        else if(x%2==0&&y%2==0) System.out.println("YES"); 
        else if(x==0&&y%2!=0) System.out.println("NO");
        else if(x%2==0&&y%2!=0) System.out.println("YES");
    
        
    }
}