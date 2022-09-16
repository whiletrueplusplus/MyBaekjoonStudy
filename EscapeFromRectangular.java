import java.util.Scanner;

public class EscapeFromRectangular {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int w=scan.nextInt();
		int h=scan.nextInt();
		int min1;
		int min2;
		int min;
		if(x<w-x)
			min1=x;
		else
			min1=w-x;
		if(y<h-y)
			min2=y;
		else
			min2=h-y;
		if(min1<min2)
			min=min1;
		else
			min=min2;
		System.out.println(min);
	}

}
