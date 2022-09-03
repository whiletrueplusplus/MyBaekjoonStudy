import java.util.Scanner;

public class Stack1 {

	public static void main(String[] args) {
		int[] stack=new int[10000];
		Scanner scan=new Scanner(System.in);
		int top=-1;
		StringBuilder sb=new StringBuilder();
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			if(str.equals("push"))
				stack[++top]=scan.nextInt();
			else if(str.equals("pop"))
			{
				if(top==-1)
					sb.append("-1\n");
				else
				{
					sb.append(stack[top]+"\n");
					stack[top--]=0;
				}
				
			}
			else if(str.equals("size"))
				sb.append(top+1+"\n");
			else if(str.equals("empty"))
			{
				if(top==-1)
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			else
			{
				if(top==-1)
					sb.append("-1\n");
				else
					sb.append(stack[top]+"\n");
			}
		}
		System.out.println(sb.toString());
	}

}
