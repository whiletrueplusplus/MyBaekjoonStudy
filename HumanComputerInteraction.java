import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class HumanComputerInteraction {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		String str=br.readLine();
		int[][] numofalpha=new int[26][str.length()];
		numofalpha[str.charAt(0)-'0'-49][0]=1;
		for(int i1=1;i1<str.length();i1++)
		{
			for(int j=0;j<26;j++)
			{
				if(str.charAt(i1)-'0'-49!=j)
					numofalpha[j][i1]=numofalpha[j][i1-1];
				else
					numofalpha[j][i1]=numofalpha[j][i1-1]+1;
			}
		}
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int alpha=st.nextToken().charAt(0)-'0'-49;
			int first=Integer.parseInt(st.nextToken());
			int last=Integer.parseInt(st.nextToken());
			if(first==0)
				sb.append(numofalpha[alpha][last]).append("\n");
			else
				sb.append(numofalpha[alpha][last]-numofalpha[alpha][first-1]).append("\n");
			
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
