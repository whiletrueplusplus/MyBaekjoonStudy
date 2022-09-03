import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Card2_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		br.close();
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		if(num==1)
			list.add(1);
		
		else
		{
			int index=0;
			for(int i=1;i<=num;i++)
				list.add(i);
			while(list.size()!=2&&list.size()!=3)
			{
				if(index==list.size())
					index=0;
				else if(index==list.size()+1)
					index=1;
				while(index<list.size())
					list.remove(index++);
			}
			if(index==list.size()+1)
				list.add(list.remove(0));
			while(list.size()!=1)
			{
				list.remove(0);
				list.add(list.remove(0));
			}
		}
		bw.write(list.get(0)+"");
		
		bw.flush();
		bw.close();
	}

}
