import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Editor {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		char [] left = new char[600000];
		char [] right = new char[600000];
		int l=-1;
		int r=-1;
		String str=br.readLine();
		for(int i=0;i<str.length();i++)
			left[++l]=str.charAt(i);
		int count=Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
			String[] split=br.readLine().split(" ");
			if(split[0].equals("L")&&l!=-1)
			{
				right[++r]=left[l];
				left[l--]='\0';
			}
			else if(split[0].equals("D")&&r!=-1)
			{
				left[++l]=right[r];
				right[r--]='\0';
			}
			else if(split[0].equals("B")&&l!=-1)
				left[l--]='\0';
			else if(split[0].equals("P"))
				left[++l]=split[1].charAt(0);
		}
		
		br.close();
		while(l!=-1)
			right[++r]=left[l--];
		String answer="";
		while(r!=-1)
			answer+=right[r--];
		bw.write(answer);
		bw.close();
	}

}
