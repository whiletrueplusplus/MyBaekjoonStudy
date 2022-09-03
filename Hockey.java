import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hockey {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int p=Integer.parseInt(st.nextToken());
		int number=0;
		for(int i=0;i<p;i++)
		{
			StringTokenizer s=new StringTokenizer(br.readLine());
			int px=Integer.parseInt(s.nextToken());
			int py=Integer.parseInt(s.nextToken());
			if(px<x&&(px-x)*(px-x)+(py-h/2-y)*(py-h/2-y)<=(h/2)*(h/2)||px>x+w&&(px-x-w)*(px-x-w)+(py-h/2-y)*(py-h/2-y)<=(h/2)*(h/2)||px>=x&&px<=x+w&&py>=y&&py<=y+h)
				number++;
		}
		System.out.println(number+"");
	}

}
