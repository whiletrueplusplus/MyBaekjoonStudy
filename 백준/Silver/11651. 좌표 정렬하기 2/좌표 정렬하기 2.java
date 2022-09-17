import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Comparator<int[]> cp=new Comparator<>() {
			@Override
			public int compare(int[] a,int[] b)
			{
				if(a[1]<b[1])
					return -1;
				else if(a[1]==b[1])
				{
					if(a[0]>b[0])
						return 1;
					else if(a[0]==b[0])
						return 0;
					else
						return -1;
				}
				else 
					return 1;
			}
		};
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[][] array=new int[n][2];
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			array[i][0]=Integer.parseInt(st.nextToken());
			array[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array,cp);
		for(int i=0;i<n;i++)
			bw.write(array[i][0]+" "+array[i][1]+"\n");
		bw.close();
		br.close();
	}

}
