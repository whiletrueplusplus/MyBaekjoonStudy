import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] triangle=new int[n*(n+1)/2];
		int[] ans=new int[n*(n+1)/2];
		for(int i=0;i<n*(n+1)/2;i++)
			triangle[i]=scan.nextInt();
		for(int i=n*(n+1)/2-1;i>=n*(n+1)/2-n;i--)
			ans[i]=triangle[i];
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				ans[i*(i-1)/2+j]=ans[i*(i-1)/2+j+i]+triangle[i*(i-1)/2+j];
				if(ans[i*(i-1)/2+j]<ans[i*(i-1)/2+j+i+1]+triangle[i*(i-1)/2+j])
					ans[i*(i-1)/2+j]=ans[i*(i-1)/2+j+i+1]+triangle[i*(i-1)/2+j];
			}
		}
		System.out.println(ans[0]);
	}

}