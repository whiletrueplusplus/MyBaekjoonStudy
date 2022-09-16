import java.util.Scanner;

public class WhatIsRecursion {
	
	static void recursion(int r,int constant)
	{
		if(r==0)
		{
			String first="\"����Լ��� ������?\"";
			String second="\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"";
			String last="��� �亯�Ͽ���.";
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
		String[]head= {"\"����Լ��� ������?\""
						,"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."
						,"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���."
						,"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\""};
		String tail="��� �亯�Ͽ���.";
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
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion(r,r);
	}

}
