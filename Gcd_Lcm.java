import java.util.Scanner;

public class Gcd_Lcm {
	public static int gcd(int n,int m)
	{
		while(m!=0)
		{
			int temp=m;
			m=n%m;
			n=temp;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		System.out.println(gcd(n,m)+"\n"+n*m/gcd(n,m));
	}

}
