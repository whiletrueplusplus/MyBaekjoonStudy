import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FindingNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num1=Integer.parseInt(br.readLine());
		int[]arr1=new int[num1];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<num1;i++)
			arr1[i]=Integer.parseInt(st.nextToken());
		
		int num2=Integer.parseInt(br.readLine());
		
		int[]arr2=new int[num2];
		int[]arr=new int[num2];
		
		StringTokenizer st1=new StringTokenizer(br.readLine());
		
		for(int i=0;i<num2;i++)
			arr2[i]=Integer.parseInt(st1.nextToken());
		br.close();
		for(int i=0;i<num2;i++)
		{
			arr[i]=0;
			for(int j:arr1)
			{
				if(arr2[i]==j)
				{
					arr[i]=1;
					break;
				}
			}
		}
		for(int i:arr)
			bw.write(i+"\n");
		bw.flush();
		bw.close();
	}

}
