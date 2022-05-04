import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=(char)br.read();
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}