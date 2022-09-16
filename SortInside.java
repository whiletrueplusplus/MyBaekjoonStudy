import java.util.Arrays;
import java.util.Scanner;

public class SortInside {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int s=0;
		int temp=num;
		while(temp!=0)
		{
			temp/=10;
			s++;
		}
		int[] array=new int[s];
		for(int i=0;i<s;i++)
		{
			array[i]=num%10;
			num/=10;
		}
		int j=1;
		int answer=0;
		Arrays.sort(array);
		for(int i=0;i<s;i++)
		{
			answer+=array[i]*j;
			j*=10;
		}
		System.out.println(answer);
	}

}
