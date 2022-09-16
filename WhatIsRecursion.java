import java.util.Scanner;

public class WhatIsRecursion {
	
	static void recursion(int r,int constant)
	{
		if(r==0)
		{
			String first="\"재귀함수가 뭔가요?\"";
			String second="\"재귀함수는 자기 자신을 호출하는 함수라네\"";
			String last="라고 답변하였지.";
			for(int i=0;i<constant*4;i++)
			{
				first="_"+first;
				second="_"+second;
				last="_"+last;
			}
			System.out.println(first);
			System.out.println(second);
			System.out.println(last);
			return;
		}
		String[]head= {"\"재귀함수가 뭔가요?\""
						,"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
						,"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
						,"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
		String tail="라고 답변하였지.";
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4*(constant-r);j++)
				head[i]="_"+head[i];
		}
		for(int i=0;i<4*(constant-r);i++)
			tail="_"+tail;
		for(String i:head)
			System.out.println(i);
		recursion(r-1,constant);
		System.out.println(tail);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursion(r,r);
	}

}
