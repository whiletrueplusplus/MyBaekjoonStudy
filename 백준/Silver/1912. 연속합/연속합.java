import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[] sum=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		sum[0]=Integer.parseInt(st.nextToken());
		for(int i=1;i<n;i++)
		{
			sum[i]=Integer.parseInt(st.nextToken());
			if(sum[i]<sum[i]+sum[i-1])
				sum[i]=sum[i]+sum[i-1];
		}
		int max=sum[0];
		for(int i=0;i<n;i++)
			if(max<sum[i])
				max=sum[i];
		System.out.print(max);
	}

}
