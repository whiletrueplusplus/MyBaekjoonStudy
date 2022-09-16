import java.util.Scanner;

public class Main {
	public static int gcd(int n,int m) {
		if(m==0)
			return n;
		else
			return gcd(m,n%m);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int g;
		int s=scan.nextInt();
		if(s-m>0)
			g=s-m;
		else
			g=m-s;
			
		for(int i=1;i<n;i++)
		{
			int j=scan.nextInt();
			if(j-m>0)
				g=gcd(g,j-m);
			else
				g=gcd(g,m-j);
		}
		System.out.println(g);
	}

}
