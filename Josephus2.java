import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Node{
	int number;
	Node node;
}
public class Josephus2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		br.close();
		Node p=new Node();
		p.number=1;
		Node first=p;
		
		int total=Integer.parseInt(st.nextToken());
		for(int i=2;i<=total;i++)
		{
			Node next=new Node();
			next.number=i;
			p.node=next;
			p=next;
		}
		p.node=first;
		p=first;
		first=null;
		
		
		int skip=Integer.parseInt(st.nextToken());
		bw.write("<");
		Node q = new Node();
		for(int i=0;i<total;i++)
		{
			for(int j=1;j<skip;j++)
			{
				q=p;
				p=p.node;
			}
			bw.write(p.number+"");
			if(i<total-1)
				bw.write(", ");
			q.node=p.node;
			p=null;
			p=q.node;
		}
		
		bw.write(">");
		
		bw.flush();
		bw.close();
	}

}
