import java.util.Arrays;
import java.util.Scanner;

public class B_1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �ٿ� �Է��� ���ڸ� �Է��Ͻÿ�: ");
		int a= sc.nextInt();
		
		System.out.println("���ڸ� �پ�⸦ �������� ù��° ���� ���� ��ŭ �Է����ּ���: ");
		int[] arr=new int [a];
		for (int i =0; i<a; i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);		//�֤ĸ� �Ⱦ��� �̺�Ž�� �Ұ���
		
		System.out.println("�ι�° �ٿ� �Է��� ���ڸ� �Է��ϼ���: ");
		int b=sc.nextInt();
		
		System.out.println("���� ���ڵ��� �Է��� ���ڸ�ŭ �پ�� �������� �Է����ּ���: ");
		int[] arr2= new int [b];
		for(int i=0; i<b; i++) {
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<b;i++) {
			System.out.println(bs(arr, arr2[i]));
		}
		
	}
	
	public static int bs(int[] arr, int n) {
		int l=0;
		int h=arr.length-1;
		int m=0;
		
		while(l<=h) {
			m=(l+h)/2;
			if (arr[m]==n)
				return 1;
			else if(arr[m]>n)
				h= m-1;
			else
				l=m+1;
		}
		
		return 0;
	}
	
}
