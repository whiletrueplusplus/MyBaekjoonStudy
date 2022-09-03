import java.util.Scanner;

public class Postfix {
	static int isp(char c) {
		if(c=='*'||c=='/')
			return 2;
		else if(c=='+'||c=='-')
			return 1;
		else if(c=='(')
			return 0;
		else
			return -1;
	}
	static int icp(char c) {
		if(c=='*'||c=='/')
			return 2;
		else if(c=='+'||c=='-')
			return 1;
		else
			return 4;
	}
	static void postfix(String e) {
		Stack stack=new Stack();
		stack.stackchar[0]='_';
		int top=0;
		
		int i=0;
		while(true)
		{
			
			char x=e.charAt(i++);
			if(x=='!')
			{
				while(top>0)
				{
					System.out.print(stack.stackchar[top]);
					top--;
				}
				System.out.print('!');
				return;
			}
			else if(x!=')'&&x!='*'&&x!='/'&&x!='+'&&x!='-'&&x!='(')
				System.out.print(x);
			
			else if(x==')')
			{
				
				while(stack.stackchar[top]!='(')
				{
					
					System.out.print(stack.stackchar[top]);
					top--;
				}
				top--;
			}
			else
			{
				while(isp(stack.stackchar[top])>=icp(x))
					{
						
						System.out.print(stack.stackchar[top]);
						top--;
					}
				top++;
				stack.add(x,stack.stackchar,top);
				
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.print("중위식을 입력하시오:");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		postfix(str);
	}

}
