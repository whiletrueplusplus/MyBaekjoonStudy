import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ExpressionOfSet {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());


		int numsize=Integer.parseInt(st.nextToken());
		HashMap<Integer,ArrayList<Integer>> mapNtoE=new HashMap<Integer,ArrayList<Integer>>();
		int [] mapEtoN=new int[numsize+1];
		int repeat=Integer.parseInt(st.nextToken());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<repeat;i++)
		{
			StringTokenizer t=new StringTokenizer(br.readLine());
			if(Integer.parseInt(t.nextToken())==0)
			{
				int n1=Integer.parseInt(t.nextToken());
				int n2=Integer.parseInt(t.nextToken());
				//모든 숫자가 포함된 집합이 없을때
				if(mapEtoN[n1]==0&&mapEtoN[n2]==0)
				{
					ArrayList<Integer> temp=new ArrayList();
					temp.add(n1);
					temp.add(n2);
					mapNtoE.put(i+1,temp);
					mapEtoN[n1]=mapEtoN[n2]=i+1;
				}
				//첫번째 숫자가 포함된 집합이 없을 때
				else if(mapEtoN[n1]==0&&mapEtoN[n2]!=0)
				{
					mapNtoE.get(mapEtoN[n2]).add(n1);
					mapEtoN[n1]=mapEtoN[n2];
				}
				//두번째 숫자가 포함된 집합이 없을때
				else if(mapEtoN[n1]!=0&&mapEtoN[n2]==0)
				{
					mapNtoE.get(mapEtoN[n1]).add(n2);
					mapEtoN[n2]=mapEtoN[n1];
				}
				else
				{
					mapNtoE.get(mapEtoN[n2]).addAll(mapNtoE.get(mapEtoN[n1]));
					for(int j=0;j<mapNtoE.get(mapEtoN[n2]).size();j++)
						mapEtoN[mapNtoE.get(mapEtoN[n2]).get(j)]=mapEtoN[n2];
				}
				
			}
			else	
			{
				int n1=Integer.parseInt(t.nextToken());
				int n2=Integer.parseInt(t.nextToken());
				if(mapEtoN[n1]==mapEtoN[n2]&&mapEtoN[n1]!=0&&mapEtoN[n2]!=0)
					sb.append("YES\n");
				else
					sb.append("NO\n");

			}
			
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
