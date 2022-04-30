 import java.io.*;
class sample{
    public static void main(String args[])throws Exception{
        int x,y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char ch1[] = s.toCharArray();
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        for(int i=a;i<=b;i++){
            System.out.print(ch1[i]);
        }
    }
}