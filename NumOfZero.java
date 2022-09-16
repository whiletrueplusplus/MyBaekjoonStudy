import java.util.Scanner;

public class NumOfZero {
	public static long find2(long n)
	{
		long answer=0;
		for(long i=2;i<=n;i*=2)
			answer+=n/i;
		return answer;
	}
	public static long find5(long n)
	{
		long answer=0;
		for(long i=5;i<=n;i*=5)
			answer+=n/i;
		return answer;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		long num2=find2(n)-find2(m)-find2(n-m);
		long num5=find5(n)-find5(m)-find5(n-m);
		if(num2<num5)
			System.out.println(num2);
		else
			System.out.println(num5);
	}

}
