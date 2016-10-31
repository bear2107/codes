import java.io.*;
import java.util.*;
class dijstra
{
	public static void main(String args[]) throws IOException
	{

int xe=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int m=Integer.parseInt(s[1]);
			int graph[][]=new int[n+1][n+1];
			
			while(m>0)
			{

				String se[]=br.readLine().split(" ");
				int u=Integer.parseInt(se[0]);
				int v=Integer.parseInt(se[1]);
				if(graph[u][v]>0&&graph[u][v]>Integer.parseInt(se[2])||graph[u][v]==0)
				{
				graph[u][v]=Integer.parseInt(se[2]);
				graph[v][u]=Integer.parseInt(se[2]);
				}
			


				m--;

			}
			int dis[]=new int[n+1];
			for(int i=0;i<=n;i++)
				dis[i]=Integer.MAX_VALUE;
			boolean visited[]=new boolean[n+1];
			int x=Integer.parseInt(br.readLine());
			xe=x;
			visited[x]=true;
			dis[x]=0;
			int count=0;
			for(int i=1;i<=n;i++)
			{

				if(graph[x][i]>0)
					dis[i]=dis[x]+graph[x][i];

			}
			while(count!=n-1)
			{
				int mn=Integer.MAX_VALUE;
					int possible=0;
				for(int i=1;i<=n;i++)
				{

					if(visited[i]==false&&dis[i]<mn)
					{
						possible=i;
						mn=dis[i];
					}

				}
				x=possible;
				if(x!=0)
				{


				visited[x]=true;

			for(int i=1;i<=n;i++)
			{

				if(graph[x][i]>0&&dis[i]>dis[x]+graph[x][i])
					dis[i]=dis[x]+graph[x][i];


			}
}
			count++;
}
for(int z=1;z<=n;z++)
{
	if(z!=xe&&visited[z]==true)
		System.out.print(dis[z]+" ");
	else if(visited[z]==false)
		System.out.print("-1"+" ");
}
System.out.println();



			t--;
		}
	}
}