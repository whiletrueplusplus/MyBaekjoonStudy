import java.util.Scanner;

public class Maze {
	static void path(int [][]maze,int[][]mark,int m,int n,int[][]move,int[][]stack)
	{
		mark[0][0]=1;
		stack[0][0]=1;
		stack[0][1]=1;
		stack[0][2]=1;
		int top=0;
		while(top!=-1)
		{
			int i=stack[top][0];
			int j=stack[top][1];
			int mov=stack[top][2]+1;
			top--;
			while(mov<8)
			{
				int g=i+move[mov][0];
				int h=j+move[mov][1];
				if(g==m&&h==n)
				{
					for(int p=0;p<=top;p++)
					{
						System.out.printf("%d,%d\n",stack[p][0],stack[p][1]);
					}
					System.out.printf("%d,%d\n",i,j);
					System.out.printf("%d,%d\n",m,n);
					return;
				}
				if(maze[g][h]==0&&mark[g][h]==0)
				{
					mark[g][h]=1;
					top++;
					stack[top][0]=i;
					stack[top][1]=j;
					stack[top][2]=mov;
					mov=-1;
					i=g;
					j=h;
				}
				mov++;
			}
		}
		System.out.println("no path has been found");
	}
	//public static void main(String[] args)
	{
		int[][]maze=
				{{1,1,1,1,1,1,1,1},
				 {1,0,0,0,0,0,0,1},
				 {1,1,1,1,1,1,0,1},
				 {1,0,0,0,0,0,0,1},
				 {1,0,1,1,1,1,1,1},
				 {1,0,0,0,0,0,0,1},
				 {1,1,1,1,1,1,1,1}};
		int[][]mark=
			{{0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0},
			 {0,0,0,0,0,0,0,0}};
		int[][]move= {
				{-1,0},
				{-1,1},
				{0,1},
				{1,1},
				{1,0},
				{1,-1},
				{0,-1},
				{-1,-1}
		};
		Stack stack=new Stack();
		path(maze,mark,6,5,move,stack.stack3);
	}
	
}
