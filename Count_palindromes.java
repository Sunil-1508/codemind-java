import java.io.*;
import java.util.*;
class Sample
{
    public static  boolean palindrome(int n)
    {
        int t=n,s=0;
        while(t>0)
        {
         s=s*10+t%10;
         t/=10;
        }
        if(s==n) return true;
        else return false;
    }
    public static void main(String args[])throws Exception
    {
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int ar[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {     
            ar[i] = sc.nextInt(); 
                if(palindrome(ar[i])==true){
             c+=1;
                }
            }
        System.out.println(c);
        }
    }