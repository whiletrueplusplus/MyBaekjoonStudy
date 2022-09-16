import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
			str[i]=scan.next();
		Comparator<String> cp=new Comparator<String>() {
			
			public int compare(String a,String b) {
				if(a.length()!=b.length())
					return a.length()-b.length();
				int i=0;
				while(i<a.length()&&i<b.length())
				{
					if(a.charAt(i)!=b.charAt(i))
						return (int)a.charAt(i)-(int)b.charAt(i);
					i++;
				}
				
				return 0;
				
			}

		};
			
			Arrays.sort(str,cp);
			String temp="";
			for(int i=0;i<str.length;i++)
			{
				if(!temp.equals(str[i]))
				{
					temp=str[i];
					System.out.println(temp);
				}
			
		}
	}

}
