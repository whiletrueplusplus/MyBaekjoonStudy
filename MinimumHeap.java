import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;



public class MinimumHeap {
	static void insert(int[]tree,int index,int number) {
		tree[index]=number;
		int i=index;
		while(i>0)
		{
			i/=2;
			if(index%2==1&&tree[index/2]>tree[index])
			{
				int temp=tree[index/2];
				tree[index/2]=tree[index];
				tree[index]=temp;
				index/=2;
			}
			else if(index>1&&index%2==0&&tree[index/2-1]>tree[index])
			{
				int temp=tree[index/2-1];
				tree[index/2-1]=tree[index];
				tree[index]=temp;
				index=index/2-1;
			}
			else
				break;
		}
	}
	static int delete(int[] tree,int index)
	{
		
		int temp=tree[0];
		tree[0]=tree[index];
		tree[index]=temp;
		tree[index]=0;
		int i=0;
		
		while(true)
		{
			int min=tree[i];
			if(tree[2*i+1]<tree[2*i+2]||2*i+1<index)
				min=tree[2*i+1];
			if(tree[2*i+1]>=tree[2*i+2]&&2*i+2<index)
				min=tree[2*i+2];
			if(tree[i]>min)
			{
				if(min==tree[2*i+1])
				{
					int t=tree[i];
					tree[i]=tree[2*i+1];
					tree[2*i+1]=t;
					i=2*i+1;
					
				}
				else if(min==tree[2*i+2])
				{
					int t=tree[i];
					tree[i]=tree[2*i+2];
					tree[2*i+2]=t;
					i=2*i+2;
				}
				
			}
			else
				break;
		}
		return temp;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> answer=new ArrayList();
		
		int num=Integer.parseInt(br.readLine());
		int[] array=new int[2*num];
		int index=-1;
		for(int i=0;i<num;i++)
		{
			int n=Integer.parseInt(br.readLine());
			if(n==0)
			{
				if(index==-1)
					index=0;
				if(index>-1)
				{
					answer.add(delete(array,index));
					index--;
				}
			}
			else 
				insert(array, ++index, n);
			
		}
		
		for(int i:answer)
			bw.write(i+"\n");
		
		br.close();
		bw.close();
	}

}
