import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class NumberCard2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer,Integer>arr1=new HashMap();
		int num1=Integer.parseInt(br.readLine());
		String[] str1=br.readLine().split(" ");
		for(int i=0;i<num1;i++)
		{
			//Ű ���� ������ ���� 1�� ����
			if(!arr1.containsKey(Integer.parseInt(str1[i])))
					arr1.put(Integer.parseInt(str1[i]),1);
			//Ű���� ������ 1�� ����
			else
				arr1.put(Integer.parseInt(str1[i]), arr1.get(Integer.parseInt(str1[i]))+1);
			
		}
		int num2=Integer.parseInt(br.readLine());
		// 2��° ���� ���ڷ� �ٲ㼭 �����ϴ� �迭
		int[]arr2=new int[num2];
		//2��° ���� ������ ������ �����ϴ� �迭
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
