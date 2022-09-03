import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;





public class NumberCard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num1=Integer.parseInt(br.readLine());
		int []arr1=new int[num1];
		
		String[] str1=br.readLine().split(" ");
		for(int i=0;i<num1;i++)
			arr1[i]=Integer.parseInt(str1[i]);
		
		int num2=Integer.parseInt(br.readLine());
		int[] arr2=new int[num2];
		int[] answer=new int[num2];
		
		String[] str2=br.readLine().split(" ");
		for(int i=0;i<num2;i++)
			arr2[i]=Integer.parseInt(str2[i]);
		
		
		for(int i=0;i<num2;i++)
		{
			int ans=0;
			for(int j:arr1)
			{
				
				if(arr2[i]==j)
				{
					ans++;	
				}
			}
			answer[i]=ans;
		}
		
		for(int i:answer)
			bw.write(i+" ");
		br.close();
		bw.flush();
		bw.close();
	}

}
