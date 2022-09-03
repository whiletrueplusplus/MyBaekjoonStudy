import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Card2_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		LinkedList<Integer> q=new LinkedList();
		for(int i=1;i<=num;i++)
			q.add(i);
		while(q.size()!=1)
		{
			q.remove(0);
			q.add(q.remove(0));
		}
		bw.write(q.get(0)+"");
		bw.flush();
		bw.close();
	}

}
