import java.util.Scanner;


public class Main {
	public static int fib(int n)
	{
		
		if(n == 1 || n == 2){
            cnt++;
            return 1;
        }
		
		return fib(n-1)+fib(n-2);
	}
	public static int fibonacci(int n) {
		arr[1]=arr[2]=1;
		for(int i=3;i<=n;i++)
		{
			arr[n]=arr[n-1]+arr[n-2];
			dpcnt++;
		}
		return arr[n];
	}
	static int cnt=0;
	static int dpcnt=0;
	static int[] arr;
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		arr=new int[n+1];
		fib(n);
		fibonacci(n);
		System.out.println(cnt+" "+dpcnt);
	}

}
