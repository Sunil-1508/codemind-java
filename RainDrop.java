import java.io.*;

class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n%3==0||n%5==0||n%7==0){
        if(n%3==0) System.out.print("Pling");
        if(n%5==0) System.out.print("Plang");
        if(n%7==0) System.out.print("Plong");
        }
        else System.out.print(n);
    }}