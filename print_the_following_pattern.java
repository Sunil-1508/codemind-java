import java.util.*;
class sample
{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<=n-i;j++)
        System.out.print(j);
        System.out.println();
    }
    } 
}