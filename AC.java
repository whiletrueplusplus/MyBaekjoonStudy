import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			String rd=br.readLine();
			int size=Integer.parseInt(br.readLine());
			String str=br.readLine();
			
			
			StringTokenizer string=new StringTokenizer(str,"[],");
			ArrayDeque<String> deque=new ArrayDeque();
			for(int j=0;j<size;j++)
				deque.offerLast(string.nextToken());
			int ht=0;
			for(int j=0;j<rd.length();j++)
			{
				
				if(rd.charAt(j)=='R')
					ht=(ht+1)%2;
				else
				{
					if(deque.isEmpty())
					{
						bw.write("error\n");
						break;
					}
					else if(ht==0)
						deque.pollFirst();
						
					else
						deque.pollLast();
						
				}
				if(deque.isEmpty()&&j==rd.length()-1)
				{
					bw.write("[]\n");
					break;
				}
			}
			if(deque.isEmpty())
				continue;
			if(ht==0)
			{
				bw.write(deque.toString().replace(" ","")+"\n");
			}
			else
			{
				String[] d=new String[deque.size()];
				int ds=deque.size();
				for(int k=0;k<ds/2;k++)
				{
					d[k]=deque.pollLast();
					d[ds-1-k]=deque.pollFirst();
				}
				bw.write(Arrays.toString(d).replace(" ","")+"\n");
				
			}
			
		}
		bw.close();
		br.close();
	}

}
