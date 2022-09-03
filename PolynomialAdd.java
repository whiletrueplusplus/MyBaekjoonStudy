/*���׽��� ������ ���ϴ� �Լ��ν� ���׽��� ���¸� �迭�� ��ȯ�ϰ� �� �迭�� �̿��� ���� ���� �� �ٽ� ���׽����� ��ȯ�ϴ� �Լ��� �ۼ�
 * �Ͽ� ȣ���Ͽ���. ���׽��� �迭�� ��ȯ�ϴ� �Լ������� -x,+x,x�� ���׽��� �迭�� �Ϻκ����� ��ȯ�ϴ� �κа� �ƴ� �κ����� ������
 * +,-�� ��ȣ�� ����,������ ������ �κп��� �ٷ� ����ġ�� ���� ������ ���� �ٸ� ���ڸ� �߰��ϰ� �Ͽ���. �׸��� �迭�� �ٽ� ���׽�
 * ���� ��ȯ�ϴ� �Լ������� �迭�� ����� ����� ���� ������ ��, ������ 1���� Ŭ���� 1�϶� �׸��� ����� ���� ����� ��ȯ�Ͽ���.*/
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
