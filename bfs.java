import java.io.*;
import java.util.*;
class bfs
{

	public static void main(String args[])throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
			
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			LinkedList<Integer> graph[]=new LinkedList[n+1];
			int m=Integer.parseInt(s[1]);
			for(int y=1;y<=n;y++)
				graph[y]=new LinkedList<Integer>();
			while(m>0)
			{
				String se[]=br.readLine().split(" ");
				int u=Integer.parseInt(se[0]);
				int v=Integer.parseInt(se[1]);
				graph[u].add(v);
				graph[v].add(u);


				m--;
			}


			int x=Integer.parseInt(br.readLine());
			boolean visited[]=new boolean[n+1];
			int dis[]=new int[n+1];
			Queue<Integer> q=new LinkedList<Integer>();
			q.add(x);
			int po=1;
			dis[x]=0;
			while(q.peek()!=null)
			{
				int u=q.poll();
				//dis[u]=0;
				visited[u]=true;
				Iterator<Integer> it=graph[u].iterator();
				while(it.hasNext())
				{

					int v=it.next();
					if(visited[v]==false)
					{
						dis[v]=dis[u]+1;
						
						visited[v]=true;
						q.add(v);
					}
				}
				po++;

			}
		

				for(int i=1;i<=n;i++)
				{

					if(i!=x)
					{

						if(dis[i]>0)
							System.out.print(6*dis[i]+" ");
						else
							System.out.print("-1"+" ");




					}
				}
				System.out.println();













			t--;
		}

	}
}