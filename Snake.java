import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Snake {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int n1=Integer.parseInt(br.readLine());
		ArrayList<Integer> applex=new ArrayList();
		ArrayList<Integer> appley=new ArrayList();
		for(int i=0;i<n1;i++)
		{
			String[] str=br.readLine().split(" ");
			appley.add(Integer.parseInt(str[0]));
			applex.add(Integer.parseInt(str[1]));
			
		}
		int n2=Integer.parseInt(br.readLine());
		int []sec=new int[n2];
		String[]turn=new String[n2];
		for(int i=0;i<n2;i++)
		{
			String[] str=br.readLine().split(" ");
			sec[i]=Integer.parseInt(str[0]);
			turn[i]=str[1];
		}
		char direction='e';
		ArrayList<Integer> snakex=new ArrayList();
		ArrayList<Integer> snakey=new ArrayList();
		snakex.add(1);
		snakey.add(1);
		int time=0;
		int index=0;
		while(true)
		{
			
			if(index<n2&&time==sec[index])
			{
				
				if(direction=='e')
				{
					if(turn[index].equals("L"))
						direction='n';
					else
						direction='s';
				}
				else if(direction=='s')
				{
					if(turn[index].equals("L"))
						direction='e';
					else
						direction='w';
				}
				else if(direction=='w')
				{
					if(turn[index].equals("L"))
						direction='s';
					else
						direction='n';
				}
				else
				{
					if(turn[index].equals("L"))
						direction='w';
					else
						direction='e';
				}
				index++;
			}
			int x;
			int y;
			if(direction=='n')
			{
				y=-1;
				x=0;
			}
			else if(direction=='e')
			{
				y=0;
				x=1;
			}
			else if(direction=='s')
			{
				y=1;
				x=0;
			}
			else
			{
				y=0;
				x=-1;
			}
			
			snakey.add(snakey.get(snakey.size()-1)+y);
			snakex.add(snakex.get(snakex.size()-1)+x);
			time++;
			boolean snake=false;
			
			for(int i=0;i<snakex.size()-1;i++)
			{
				if(snakey.get(i)==snakey.get(snakey.size()-1)&&snakex.get(i)==snakex.get(snakex.size()-1))
				{
					snake=true;
					break;
				}
			}
			if(snake||snakey.get(snakey.size()-1)==0||snakey.get(snakey.size()-1)==n+1||snakex.get(snakex.size()-1)==0||snakex.get(snakex.size()-1)==n+1)
				break;
			boolean apple=true;
			for(int i=0;i<applex.size();i++)
			{
				if(appley.get(i)==snakey.get(snakey.size()-1)&&applex.get(i)==snakex.get(snakex.size()-1))
				{
					appley.remove(i);
					applex.remove(i);
					apple=false;
					break;
				}
			}
			if(apple)
			{
				snakey.remove(0);
				snakex.remove(0);
			}
			
		}
		bw.write(time+"");
		br.close();
		bw.close();
	}

}
