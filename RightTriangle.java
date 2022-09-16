import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		while(true)
		{
			int l1=scan.nextInt();
			int l2=scan.nextInt();
			int l3=scan.nextInt();
			if(l1==0&&l2==0&&l3==0)
				break;
			if(l1*l1+l2*l2==l3*l3)
				sb.append("right\n");
			else if(l2*l2+l3*l3==l1*l1)
				sb.append("right\n");
			else if(l1*l1+l3*l3==l2*l2)
				sb.append("right\n");
			else
				sb.append("wrong\n");
		}
		System.out.println(sb.toString());
	}

}
