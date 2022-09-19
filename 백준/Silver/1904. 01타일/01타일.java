import java.util.Scanner;

public class Main {
	static int fib(int n) {
		if(f[n]>0)
			return f[n];
		if(n<=2)
			return n;
		
		f[n]=(fib(n-1)+fib(n-2))%15746;
		return f[n];
	}
	static int[] f;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		f=new int[n+100];
		System.out.println(fib(n));
	}

}
