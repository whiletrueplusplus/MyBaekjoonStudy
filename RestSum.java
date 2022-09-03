
import java.io.IOException;
import java.util.Scanner;

public class RestSum {

	public static void main(String[] args) throws IOException {
		
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		int m=scan.nextInt();
		
		int[] restnum=new int[m];
		
		
		restnum[0]++;
		int s=0;
		for(int i=0;i<n;i++)
		{
			s=(int)(((long)s+scan.nextLong())%m);
			restnum[s]++;
		}
		long sum=0;
		for(int i=0;i<m;i++)
			if(restnum[i]>=2)
				sum+=(long)restnum[i]*(restnum[i]-1)/2;
		System.out.println(sum);
	}

}
