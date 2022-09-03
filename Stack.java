
public class Stack {
	int top=0;
	int top31=0;
	int top32=0;
	int[]stack;
	char[]stackchar=new char[100];
	int[][]stack3= new int [100][3];
	int[][] add3(int item,int[][] stack)
	{
		stack[top31][top32]=item;
		top32=(top32+1)%3;
		if(top32==0)
			top31++;
		return stack;
	}
	int[]add(int item,int[]stack)
	{
		stack[top]=item;
		top++;
		return stack;
	}
	void add(char item,char[]stackchar,int top) {
		stackchar[top]=item;
	}
}
