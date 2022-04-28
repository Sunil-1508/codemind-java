import java.io.*;
class Sample {
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s ;
		s=br.readLine();
		String a[]=s.split(":");
		int h=Integer.parseInt(a[0]);
		int m=Integer.parseInt(a[1]);
		
		float H_at=h*30;
		float M_at=m*6;
		H_at+=0.5*m;
		float ang=Math.abs(H_at-M_at);
		if(ang>180)
		ang=360-ang;
		System.out.println(ang);
		
		
	}

}
