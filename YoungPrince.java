import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class YoungPrince {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase=Integer.parseInt(br.readLine());
		int[]answerarray=new int[testcase];
		
		for(int i=0;i<testcase;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int pointnumber=Integer.parseInt(br.readLine());
			int answer=0;
			for(int j=0;j<pointnumber;j++)
			{
				StringTokenizer t=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(t.nextToken());
				int y=Integer.parseInt(t.nextToken());
				int radius=Integer.parseInt(t.nextToken());
				boolean include1=false;
				boolean include2=false;
				if((x-x1)*(x-x1)+(y-y1)*(y-y1)<radius*radius)
					include1=true;
				if((x-x2)*(x-x2)+(y-y2)*(y-y2)<radius*radius)
					include2=true;
				if(include1&&!include2||!include1&&include2)
					answer++;
				
			}
			answerarray[i]=answer;
		}
		for(int i=0;i<answerarray.length;i++)
			bw.write(answerarray[i]+"\n");
		bw.close();
		br.close();
	}

}
