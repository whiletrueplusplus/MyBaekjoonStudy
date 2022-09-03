import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
public class Okeunsu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack=new Stack<>();
		int num=Integer.parseInt(br.readLine());
		int[] tmp=new int[num];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++)
			tmp[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<num;i++)
		{
			
			while(!stack.isEmpty()&&tmp[stack.peek()]<tmp[i])
				tmp[stack.pop()]=tmp[i];
			stack.push(i);
		}
		while(!stack.isEmpty())
			tmp[stack.pop()]=-1;
		for(int i=0;i<num;i++)
			bw.write(tmp[i]+" ");
		bw.close();
		br.close();
	}

}
