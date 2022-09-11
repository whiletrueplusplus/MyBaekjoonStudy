import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int min=array[0];
		int max=array[0];
		for(int i=0;i<n;i++)
		{
			if(max<array[i])
				max=array[i];
			if(min>array[i])
				min=array[i];
		}
		System.out.println(max*min);
	}

}
