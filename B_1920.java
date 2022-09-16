import java.util.Arrays;
import java.util.Scanner;

public class B_1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 줄에 입력할 숫자를 입력하시오: ");
		int a= sc.nextInt();
		
		System.out.println("숫자를 뛰어쓰기를 기준으로 첫번째 줄의 숫자 만큼 입력해주세요: ");
		int[] arr=new int [a];
		for (int i =0; i<a; i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);		//애ㅔ를 안쓰면 이분탐색 불가능
		
		System.out.println("두번째 줄에 입력할 숫자를 입력하세요: ");
		int b=sc.nextInt();
		
		System.out.println("비교할 숫자들을 입력한 숫자만큼 뛰어쓰기 기준으로 입력해주세요: ");
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
