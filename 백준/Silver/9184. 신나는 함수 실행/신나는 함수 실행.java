import java.util.Scanner;

public class Main {
	static int[][][] warray;
	static int[][][] check;
	public static int w(int a,int b, int c) {
		if(warray[a+50][b+50][c+50]!=0)
			return warray[a+50][b+50][c+50];
		else if(a<=0||b<=0||c<=0)
			return 1;
		else if(a>20||b>20||c>20)
			return w(20,20,20);
		else if(a<b&&b<c)
		{
			warray[a+50][b+50][c+50]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			return warray[a+50][b+50][c+50];
		}
		else
		{		
			warray[a+50][b+50][c+50]=w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			return warray[a+50][b+50][c+50];
		}
			
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int a;
		int b;
		int c;
		warray=new int[101][101][101];
		while(true)
		{
			
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a==-1&&b==-1&&c==-1)
				break;
			
			sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ");
			sb.append(w(a,b,c)).append("\n");
		}
		System.out.println(sb.toString());
	}

}
