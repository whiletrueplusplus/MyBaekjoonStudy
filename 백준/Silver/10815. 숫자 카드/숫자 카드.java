import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer,Integer>arr1=new HashMap();
		int num1=Integer.parseInt(br.readLine());
		String[] str1=br.readLine().split(" ");
		for(int i=0;i<num1;i++)
		{
			//키 값이 없으면 값에 1을 대입
			if(!arr1.containsKey(Integer.parseInt(str1[i])))
					arr1.put(Integer.parseInt(str1[i]),1);
			//키값이 있으면 1을 더함
			else
				arr1.put(Integer.parseInt(str1[i]), arr1.get(Integer.parseInt(str1[i]))+1);
			
		}
		int num2=Integer.parseInt(br.readLine());
		// 2번째 줄을 숫자로 바꿔서 저장하는 배열
		int[]arr2=new int[num2];
		//2번째 줄의 숫자의 갯수를 저장하는 배열
		int[]answer=new int[num2];
		String[] str2=br.readLine().split(" ");
		br.close();
		for(int i=0;i<num2;i++)
			arr2[i]=Integer.parseInt(str2[i]);
		
		for(int i=0;i<num2;i++)
		{
			if(arr1.containsKey(arr2[i]))
				answer[i]=arr1.get(arr2[i]);
			else
				answer[i]=0;
		}
		for(int i:answer)
			bw.write(i+" ");
		bw.close();
	}

}
