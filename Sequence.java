import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int sum=0;
		int[] sumarr=new int[n];
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
			sum+=Integer.parseInt(st2.nextToken());
			sumarr[i]=sum;
		}
		int max=sumarr[m-1];
		for(int i=0;i<n-m;i++)
			if(max<sumarr[m+i]-sumarr[i])
				max=sumarr[m+i]-sumarr[i];
		bw.write(max+"");
		br.close();
		bw.close();
	}

}
