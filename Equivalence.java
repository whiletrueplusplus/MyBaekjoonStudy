import java.util.Scanner;

public class Equivalence {
void equi(int m,int n)
{
	int ptr,top, i,j,t;
	Scanner s=new Scanner(System.in);
	int[] seq=new int[n];
	int[]bit=new int[n];
	int []data=new int[2*m];
	int[]link=new int[2*m];
	for (int x=0;x<n;x++)
		seq[x]=bit[x]=0;
	int av=0;
	for(int k=0;k<m;k++)
	{
		System.out.printf("정수를 입력하세요: ");
		i=Integer.parseInt(s.next());
		System.out.printf("정수를 입력하세요: ");
		j=Integer.parseInt(s.next());
		data[av]=j;
		link[av]=seq[i-1];
		seq[i-1]=av;
		av++;
		data[av]=i;
		link[av]=seq[j-1];
		seq[j-1]=av;
		av++;
	}
	int index =0;
	do
	{
		if(bit[index]==0)
		{
			System.out.printf("A new class"+index+1+"\n");
			bit[index]=1;
			ptr=seq[index];
			top=-1;
			while(true)
			{
				while(ptr!=0)
				{
					j=data[ptr-1];
					if(bit[j-1]==0)
					{
						System.out.println(j);
						bit[j-1]=1;
						t=link[ptr-1];
						link[ptr-1]=top;
						top=ptr;
						ptr=t;
					}
					else
						ptr=link[ptr-1];
				}
				if(top==-1)
					break;
				ptr=seq[data[top]];
				top=link[top];
			}
		}
			index++;
	}while(index<=n);
}
}
