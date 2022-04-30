import java.util.*;
class sample
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int charge=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k){
                charge=charge+2;
            }
            else
            {
                charge=charge+1;
            }
        }
        System.out.println(charge);
    }
}