import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class IronStick {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String str=br.readLine();
		br.close();
		ArrayList<Character>stack=new ArrayList();
		
		int add=0;
		int answer=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				add++;
				answer++;
				stack.add('(');
			}
			else
			{
				add--;
				if(stack.get(stack.size()-1)=='(')
				{
					answer--;
					answer+=add;
				}
				stack.add(')');
			}
		}
		bw.write(""+answer);
		bw.close();
	}

}
