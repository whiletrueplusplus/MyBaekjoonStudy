import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack();
		for(int i=0;i<k;i++)
		{
			int element=Integer.parseInt(br.readLine());
			if(element!=0)
				stack.push(element);
			else
				stack.pop();
		}
		int sum=0;
		while(!stack.isEmpty())
			sum+=stack.pop();
		System.out.println(sum);
		}

}
