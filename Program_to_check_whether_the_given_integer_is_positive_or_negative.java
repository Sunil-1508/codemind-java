import java.io.*;

class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(br.readLine());
        if(c>0)
        {
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
    
} 