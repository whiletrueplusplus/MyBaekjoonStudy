import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String i=scan.next();
		StringBuilder sb=new StringBuilder();
		while(Integer.parseInt(i)!=0)
		{
			String s="yes\n";
			for(int j=0;j<i.length()-1-j;j++)
			{
				if(i.charAt(j)!=i.charAt(i.length()-1-j))
				{
					s="no\n";
					break;
				}
			}
			sb.append(s);
			i=scan.next();
			
		}
		System.out.println(sb.toString());
	}

}
