import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bracket {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int j=0;j<num;j++)
		{
			String str=(String)br.readLine();
			int num1=0;
			int num2=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='(')
					num1++;
				else
					num2++;
				if(num2>num1)
				{
					break;
				}
			}
			if(num1==num2)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
