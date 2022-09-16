import java.util.Scanner;

public class FourthPoint {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		int x3=scan.nextInt();
		int y3=scan.nextInt();
		if(x1==x2)
			System.out.print(x3+" ");
		else if(x2==x3)
			System.out.print(x1+" ");
		else
			System.out.print(x2+" ");
		if(y1==y2)
			System.out.print(y3+" ");
		else if(y2==y3)
			System.out.print(y1+" ");
		else
			System.out.print(y2+" ");
	}

}
