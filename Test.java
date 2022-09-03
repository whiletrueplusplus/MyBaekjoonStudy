import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="[]";
		int [] in={1,2,3};
		for(int i:in)
		{
			/*'8if(i!=0)
			continue;*/
			if(i%2==0)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}
