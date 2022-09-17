import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> left = new Stack();
		Stack<Character> right = new Stack();
		
		String str=br.readLine();
		for(int i=0;i<str.length();i++)
			left.push(str.charAt(i));
		int count=Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
			String[] split=br.readLine().split(" ");
			if(split[0].equals("L")&&!left.isEmpty())
				right.push(left.pop());
			else if(split[0].equals("D")&&!right.isEmpty())
				left.push(right.pop());
			else if(split[0].equals("B")&&!left.isEmpty())
				left.pop();
			else if(split[0].equals("P"))
				left.push(split[1].charAt(0));
		}
		
		br.close();
		while(!left.isEmpty())
			right.push(left.pop());
		StringBuilder answer=new StringBuilder();
		while(!right.isEmpty())
			answer.append(right.pop());
		bw.write(answer.toString());
		bw.close();
	}

}
