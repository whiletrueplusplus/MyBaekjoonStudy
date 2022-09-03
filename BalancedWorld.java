import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class BalancedWorld {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> splitted=new ArrayList();
		String str;
		while(!(str=br.readLine()).equals("."))
			splitted.add(str);
		
		
		char[][]stack=new char[splitted.size()][100];
		for(int i=0;i<splitted.size();i++)
		{
			
			
			int top=-1;
			for(int j=0;j<splitted.get(i).length();j++)
			{
				if(splitted.get(i).charAt(j)=='(')
					stack[i][++top]='(';
				else if(splitted.get(i).charAt(j)==')')
				{
					if(top==-1)
					{
						top--;
						break;
					}
					if(stack[i][top]=='[')
						break;
					else 
						stack[i][top--]='\0';
				}
				else if(splitted.get(i).charAt(j)=='[')
					stack[i][++top]='[';
					
				else if(splitted.get(i).charAt(j)==']')
				{
					if(top==-1)
					{
						top--;
						break;
					}
					if(stack[i][top]=='(')
						break;
					else 
						stack[i][top--]='\0';
				}
				
			}
			if(top==-1)
				bw.write("yes\n");
			else 
				bw.write("no\n");
		}
		br.close();
		bw.close();
	}

}
