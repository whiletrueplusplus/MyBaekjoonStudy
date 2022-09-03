import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PartSum4 {

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
		for(int i=0;i<m;i++)
		{
			StringTokenizer st3=new StringTokenizer(br.readLine());
			int n1=Integer.parseInt(st3.nextToken());
			int n2=Integer.parseInt(st3.nextToken());
			if(n1==1)
				bw.write(sumarr[n2-1]+"\n");
			else
				bw.write(sumarr[n2-1]-sumarr[n1-2]+"\n");
		}
		bw.close();
		br.close();
	}

}
