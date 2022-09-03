import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PrinterQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		int[] answer=new int[num]; 
		int max;
		for(int i=0;i<num;i++)
		{
			LinkedList<Integer> list=new LinkedList();
			StringTokenizer st= new StringTokenizer(br.readLine());
			int total= Integer.parseInt(st.nextToken());
			int point= Integer.parseInt(st.nextToken());
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<total;j++)
				list.add(Integer.parseInt(st.nextToken()));
			int ans=0;
			do
			{
				max=list.get(0);
				
				for(int j=0;j<list.size();j++)
					if(max<list.get(j))
						max=list.get(j);
				
				while(list.get(0)!=max)
				{
					if(point==0)
						point=list.size()-1;
					else
						point--;
					list.add(list.remove(0));
					
				}
				
				
				point--;
				list.remove(0);
				ans++;
			}while(point!=-1);
			answer[i]=ans;
		}
		for(int i=0;i<num;i++)
			bw.write(answer[i]+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}
