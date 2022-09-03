import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LeeDaSom {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String,String>hname=new HashMap();
		HashMap<String,String>hnumber=new HashMap();
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++)
		{
			String name=br.readLine();
			hname.put(i+1+"",name);
			hnumber.put(name,i+1+"");
		}
		int m=Integer.parseInt(st.nextToken());
		for(int i=0;i<m;i++)
		{
			String nam=br.readLine();
			if(Character.isDigit(nam.charAt(0)))
				sb.append(hname.get(nam)).append("\n");
			else
				sb.append(hnumber.get(nam)).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

}
