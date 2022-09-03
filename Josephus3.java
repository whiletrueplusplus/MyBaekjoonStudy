
import java.util.ArrayList;
import java.util.Scanner;

public class Josephus3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total= Integer.parseInt(scan.next());
		int skip= Integer.parseInt(scan.next());
		ArrayList<Integer> queue=new ArrayList<Integer>();
		
		for(int i=0;i<total;i++)
			queue.add(i,i+1);
		
		String str="<";
		int p=0;
		while(!queue.isEmpty())
		{
			
			p=(p+skip-1)%queue.size();
			str=str+queue.get(p);
			if(queue.size()>1)
				str+=", ";
			queue.remove(p);
			
		}
		str+=">";
		System.out.println(str);
	}

}
