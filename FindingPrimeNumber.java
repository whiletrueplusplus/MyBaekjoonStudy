import java.util.ArrayList;
import java.util.Scanner;

public class FindingPrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		ArrayList<Integer> prime=new ArrayList();
		
		for(int p=2;p*p<=n;p++)
		{
			boolean b=true;
			for(int i=2;i<p;i++)
			{
				if(p%i==0)
				{
					b=false;
					break;
				}
			}
			if(b)
				prime.add(p);
		}
		ArrayList<Integer> prime2=new ArrayList();
		for(int i=m;i<=n;i++)
		{
			boolean b=true;
			int j;
			for(j=0;j<prime.size();j++)
			{
				if(i%prime.get(j)==0)
				{
					b=false;
					break;
				}
			}
			if((b||i==prime.get(j))&&i!=1)
				prime2.add(i);
		}
		for(int i:prime2)
			System.out.println(i);
	}

}
