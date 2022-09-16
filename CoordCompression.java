import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoordCompression {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[]array=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++)
			array[i]=Integer.parseInt(st.nextToken());
		int[]before=new int[n];
		for(int i=0;i<n;i++)
			before[i]=array[i];
		Arrays.sort(array);
		HashMap<Integer,Integer> map=new HashMap<>();
		int temp=0;
		for(int i=0;i<n;i++)
			if(!map.containsKey(array[i]))
				map.put(array[i],temp++);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++)
			bw.write(map.get(before[i])+" ");
		bw.close();
		br.close();
	}

}
