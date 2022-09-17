import java.util.Scanner;

public class Main {
	public static int rec(int n,int []arr) {
		if(arr[n]>0)
			return arr[n];
		if(n==1)
			return 0;
		arr[n]=rec(n-1,arr)+1;
		if(n%3==0)
		{
			int a=rec(n/3,arr)+1;
			if(a<arr[n])
				arr[n]=a;
		}
		if(n%2==0)
		{
			int a=rec(n/2,arr)+1;
			if(a<arr[n])
				arr[n]=a;
		}
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n+1];
		
		System.out.println(rec(n,arr));
	}

}
