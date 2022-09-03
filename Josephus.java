import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Josephus {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		br.close();
		int total=Integer.parseInt(st.nextToken());
		int skip=Integer.parseInt(st.nextToken());
		int[][]linkedlist=new int[total][2];
		for(int i=0;i<total;i++)
			linkedlist[i][0]=i+1;
		
		linkedlist[total-1][1]=0;
		
		for(int i=0;i<total-1;i++)
			linkedlist[i][1]=i+1;
		int k=0;
		int[]answer=new int[total];
		int q = 0;
		int point=0;
		for(int i=0;i<total;i++)
		{
			for(int j=0;j<skip-1;j++)
			{
				q=point;
				point=linkedlist[point][1];
			}
			answer[k++]=linkedlist[point][0];
			linkedlist[q][1]=linkedlist[point][1];
			linkedlist[point][1]=0;
			point=linkedlist[q][1];

		}
		String str="<";
		for(int i=0;i<total-1;i++)
			str=str+answer[i]+",";
		str=str+answer[total-1]+">";
		bw.write(str);
		bw.flush();
		bw.close();
	}

}
