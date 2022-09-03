import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class CountingSort {

	static int[] sort() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		
		int[]count=new int[10001];
		
		for(int i=0;i<n;i++)
			count[Integer.parseInt(br.readLine())]++;
		br.close();
		int sum=0;
		for(int i=0;i<count.length;i++)
		{
			
			for(int j=sum;j<sum+count[i];j++)
				arr[j]=i;
			sum+=count[i];
		}
		return arr;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i:sort())
			bw.write(i+"\n");
		bw.flush();
		bw.close();
	}

}
