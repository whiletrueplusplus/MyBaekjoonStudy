import java.util.Scanner;

public class QuickSort {

	public static void quick(int[] arr,int m,int n)
	{
		if(m>=n)
			return;
		int pivot=m;
		int last=n;
		while(m<=n)
		{
			
			while(m<=n&&arr[m]>=arr[pivot])
				m++;
			
			while(m<=n&&arr[n]<=arr[pivot])
				n--;
			if(m<n)
			{
				int temp=arr[m];
				arr[m]=arr[n];
				arr[n]=temp;
			}
		}
		int temp=arr[pivot];
		arr[pivot]=arr[n];
		arr[n]=temp;
		quick(arr,pivot,n-1);
		quick(arr,n+1,last);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		int[] array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		quick(array,0,n-1);
		
		System.out.println(array[m-1]);
	}

}
