import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] array=new int[n][3];
		array[0][0]=scan.nextInt();
		array[0][1]=scan.nextInt();
		array[0][2]=scan.nextInt();
		for(int i=1;i<n;i++)
		{
			int r=scan.nextInt();
			int g=scan.nextInt();
			int b=scan.nextInt();
			for(int j=0;j<3;j++)
			{
				if(j==0)
				{
					array[i][j]=array[i-1][1]+r;
					if(array[i-1][1]+r>array[i-1][2]+r)
						array[i][j]=array[i-1][2]+r;
				}
				else if(j==1)
				{
					array[i][j]=array[i-1][0]+g;
					if(array[i-1][0]+g>array[i-1][2]+g)
						array[i][j]=array[i-1][2]+g;
				}
				else
				{
					array[i][j]=array[i-1][0]+b;
					if(array[i-1][0]+b>array[i-1][1]+b)
						array[i][j]=array[i-1][1]+b;
				}
			}
		}
		int min=array[n-1][1];
		
		if(array[n-1][0]<min)
			min=array[n-1][0];
		if(array[n-1][2]<min)
			min=array[n-1][2];
		System.out.println(min);
	}

}
