import java.io.*;
class maze
{
/*Backtracking example.The prisoner can go in any direction except for where there is motion detector denoted by 1.find the no of possible ways the prisoner can reach the destination

*/
static int count=0;

public static void main(String[] args)throws IOException {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t>0)
	{
		t--;
		count=0;
		int n=Integer.parseInt(br.readLine());
		int arr[][]=new int[n][n];
		int	mark[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			String se[]=br.readLine().split(" ");
			for(int j=0;j<se.length;j++)
			{
				arr[i][j]=Integer.parseInt(se[j]);
				mark[i][j]=0;
			}

		}


		route(0,0,arr,mark);

		System.out.println(count); 

	}
	
}
static void route(int i,int j,int arr[][],int mark[][])
{
	int n=arr.length-1;
if(i==arr.length-1&&j==arr.length-1)
{
	count++;
	return  ;
}
mark[i][j]=1;
if((j+1)<=n&&mark[i][j+1]==0&&arr[i][j+1]==0)
route(i,j+1,arr,mark);
if((i+1)<=n&&mark[i+1][j]==0&&arr[i+1][j]==0)
route(i+1,j,arr,mark);
if((j-1>=0)&&mark[i][j-1]==0&&arr[i][j-1]==0)
route(i,j-1,arr,mark);
if((i-1>=0)&&mark[i-1][j]==0&&arr[i-1][j]==0)
route(i-1,j,arr,mark);

mark[i][j]=0;

}

}
