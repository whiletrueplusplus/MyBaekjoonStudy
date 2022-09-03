/*다항식의 덧셈을 구하는 함수로써 다항식의 형태를 배열로 변환하고 그 배열을 이용해 합을 구한 뒤 다시 다항식으로 변환하는 함수를 작성
 * 하여 호출하였다. 다항식을 배열로 변환하는 함수에서는 -x,+x,x의 단항식을 배열의 일부분으로 변환하는 부분과 아닌 부분으로 나누고
 * +,-의 부호와 숫자,변수가 나오는 부분에서 바로 전위치의 항의 종류에 따라 다른 숫자를 추가하게 하였다. 그리고 배열을 다시 다항식
 * 으로 변환하는 함수에서는 배열의 계수가 양수일 때와 음수일 때, 차수가 1보다 클때와 1일때 그리고 상수일 때로 나누어서 변환하였다.*/
import java.util.Scanner;
class Polynomial{
	int[]changePol1(String arr)
	{
		int i=0;
		int j=1,k=2;
		String str="";
		for(int x=0;x<arr.length();x++)
		{
			if(arr.charAt(x)=='+'||arr.charAt(x)=='-')
				i++;
		}
		if(arr.charAt(0)=='-')
			i--;
		int []array=new int[2*(i+1)+1];
		array[0]=i+1;
		for (int x=0;x<arr.length();x++)
		{
			if(Character.isDigit(arr.charAt(x)))
			{
				str+=arr.charAt(x);
				if(x==arr.length()-1)
					{
						while(Character.isDigit(arr.charAt(x))&&x>0)
						{
							x--;
						}
						if(x==-1)
							x++;
						if(arr.charAt(x)=='-'||arr.charAt(x)=='+'||x==0)
						{
							array[j]=0;
							array[k]=Integer.parseInt(str);
						}
						else if(arr.charAt(x)=='^')
							array[j]=Integer.parseInt(str);
						else if(Character.isDigit(arr.charAt(0))||arr.charAt(0)=='-')
						{
							array[j]=0;
							array[k]=Integer.parseInt(str);
						}
						x=arr.length()-1;
					}
			}
			else if(arr.charAt(x)=='+')
			{
				if(!Character.isDigit(arr.charAt(x-1)))
					array[j]=1;
				else
				{
					array[j]=Integer.parseInt(str);
					str="";
				}
				j+=2;
			}
			else if(arr.charAt(x)=='-')
			{
				if(x==0)
					str="-";
				else if(!Character.isDigit(arr.charAt(x-1)))
				{
					array[j]=1;
					j+=2;
					str="-";
				}
				else
				{
					array[j]=Integer.parseInt(str);
					str="-";
					j+=2;
				}
			}
			else if(arr.charAt(x)=='x')
			{
				if(arr.length()==1)
				{
					array[k]=1;
					array[j]=1;
				}
				else if(x==0)
				{
					array[k]=1;
					k+=2;
				}
				else if(x==arr.length()-1)
				{
					if(!Character.isDigit(arr.charAt(x-1)))
						{
						str+="1";
						array[k]=Integer.parseInt(str);
						k+=2;
						str="";
						}
					else
					{
						array[k]=Integer.parseInt(str);
						k+=2;
						str="";
					}
					str+="1";
					array[j]=Integer.parseInt(str);
					j+=2;
					str="";
				}
				else if(!Character.isDigit(arr.charAt(x-1)))
				{
					str+="1";
					array[k]=Integer.parseInt(str);
					k+=2;
					str="";
				}
				else
				{
					array[k]=Integer.parseInt(str);
					str="";
					k+=2;
				}
			}
		}
		return array;
	}
	String changePol2(int[]arr)
	{
		String str="";
		for(int x=1;x<2*arr[0]+1;x+=2)
		{
			if(arr[x+1]==0)
			{
				if(2*arr[0]+1!=3&&arr[x+1]==0)
				{
					if(arr[x+3]>0&&str!="")
						str+="+";
				}
			}
			else
			{
				if(x==1)
				{
					if(arr[x]==0)
						str+=arr[x+1];
					else if(arr[x]==1)
						{
							if(arr[x+1]!=1)
								str+=arr[x+1];
							str+="x";
						}
					else
					{
						if(arr[x+1]!=1)
							str=str+arr[x+1];
						str=str+"x^"+arr[x];
					}
				}
				else 
				{
					if(arr[x+1]!=1&&arr[x+1]!=-1)
					{
						if(arr[x+1]>0)
							str+="+";
						if(arr[x]!=0)
							str+=arr[x+1];
					}
					else if(arr[x+1]==1)
						str+="+";
					else if(arr[x]>=1)
						str+="-";
					if(arr[x]!=0)
					{
						str+="x";
						if(arr[x]!=1)
							str=str+"^"+arr[x];
					}
					else
						str+=arr[x+1];
				}
			}
		}
		return str;
	}
	int[]add(int[]arr1,int[]arr2)
	{
		int[]array=new int[2*(arr1[0]+arr2[0])+1];
		int p=1,q=1,r=1;
		while(p<2*arr1[0]&&q<2*arr2[0])
		{
			if(arr1[p]==arr2[q])
			{
				
				array[r]=arr1[p];
				array[r+1]=arr1[p+1]+arr2[q+1];
				r+=2;
				p+=2;
				q+=2;
				
			}
			else if(arr1[p]>arr2[q])
			{
				array[r]=arr1[p];
				array[r+1]=arr1[p+1];
				p+=2;
				r+=2;
			}
			else
			{
				array[r]=arr2[q];
				array[r+1]=arr2[q+1];
				q+=2;
				r+=2;
			}
		}
		while(p<=2*arr1[0])
		{
			array[r]=arr1[p];
			array[r+1]=arr1[p+1];
			p+=2;
			r+=2;
		}
		while(q<=2*arr2[0])
		{
			array[r]=arr2[q];
			array[r+1]=arr2[q+1];
			q+=2;
			r+=2;
		}
		array[0]=(r-1)/2;
		return array;
	}
}
public class PolynomialAdd {

	public static void main(String[] args) {
		String str1,str2;
		Scanner scan= new Scanner(System.in);
		str1=scan.next();
		str2=scan.next();
		Polynomial pol=new Polynomial();
		int[]arr=pol.add(pol.changePol1(str1),pol.changePol1(str2));
		System.out.println(pol.changePol2(arr));

	}

}
