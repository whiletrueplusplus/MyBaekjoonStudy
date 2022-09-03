import java.util.Scanner;

public class MelonFarm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int melon=scan.nextInt();
		int subarea = 0;
		int area = 0;
		int[] direction=new int[6];
		int[] length=new int[6];
		for(int i=0;i<6;i++)
		{
			direction[i]=scan.nextInt();
			length[i]=scan.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			if(direction[i]==direction[(i+2)%6]&&direction[(i+1)%6]==direction[(i+3)%6])
			{
				subarea=length[(i+1)%6]*length[(i+2)%6];
				area=length[(i+4)%6]*length[(i+5)%6];
			}
		}
		System.out.println(melon*(area-subarea)+"");
	}

}
