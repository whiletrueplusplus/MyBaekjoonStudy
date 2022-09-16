import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int mean=0;
		
		int n=Integer.parseInt(br.readLine());
		int[] array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=Integer.parseInt(br.readLine());
		Arrays.sort(array);
		for(int i=0;i<n;i++)
			mean+=array[i];
		if(mean>=0)
			mean=(int)((float)mean/n+0.5);
		else
			mean=(int)((float)mean/n-0.5);
		int middle=array[n/2];
		
		int com=array[0];
		int most=array[0];
		
		int point=0;
		int max=0;
		int count=1;
		int c=0;
		int i=0;
		while(i<n)
		{
			while(i<n&&com==array[i])
			{
				i++;
			}
			
			count=i-point;
			if(i<n)
			{
				point=i;
				com=array[i];
			}
			if(count>max)
			{
				c=0;
				max=count;
				most=array[i-1];
			}
			else if(count==max&&c<1)
			{
				c++;
				most=array[i-1];
			}
				
		}
		
		int range=array[n-1]-array[0];
		System.out.println(mean);
		System.out.println(middle);
		System.out.println(most);
		System.out.println(range);
	}
	
}
