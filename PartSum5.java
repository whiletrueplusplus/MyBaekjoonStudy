import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PartSum5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer t=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(t.nextToken());
		int m=Integer.parseInt(t.nextToken());
		int [][] array=new int[n][n];
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			array[i][0]=Integer.parseInt(st.nextToken());
			for(int j=1;j<n;j++)
				array[i][j]=array[i][j-1]+Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<m;i++)
		{
			StringTokenizer s=new StringTokenizer(br.readLine());
			int y1=Integer.parseInt(s.nextToken())-1;
			int x1=Integer.parseInt(s.nextToken())-1;
			int y2=Integer.parseInt(s.nextToken())-1;
			int x2=Integer.parseInt(s.nextToken())-1;
			int sum=0;
			for(int j=y1;j<=y2;j++)
			{
				if(x1==0)
					sum+=array[j][x2];
				else
					sum+=array[j][x2]-array[j][x1-1];
			}
			sb.append(sum+"\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
