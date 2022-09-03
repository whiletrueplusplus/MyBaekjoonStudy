import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StackOrder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		char[]pushpop=new char[1000000];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());

		int addnum=0;
		int pp=0;
		int[]stack=new int[num];
		int top=-1;
		for(int i=0;i<num;i++)
		{
			
			int compare=Integer.parseInt(br.readLine());
			if(addnum<compare)
			{
				while(addnum<compare)
				{
					stack[++top]=++addnum;
					pushpop[pp++]='+';
				}
				
				stack[top]=0;
				top--;
				pushpop[pp++]='-';
			}
			else if(stack[top]==compare)
			{
				
				stack[top]=0;
				top--;
				pushpop[pp++]='-';
			}
			else
			{
				bw.write("NO");
				break;
			}
			
		}
		if(top==-1)
		{
		for(int i=0;i<pp;i++)
			bw.write(pushpop[i]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
