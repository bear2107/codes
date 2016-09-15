import java.io.*;
class fibo
{

public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());

while(t>0)
{

String s[]=br.readLine().split(" ");
int n=Integer.parseInt(s[0]);
if(n==0)
System.out.println("0");
else
{


//long m=Integer.parseInt(s[1]);
int z[][]={{0,1},{1,1}};

z=compute(z,1000000007,n);
System.out.println(z[1][1]);

t--;
}	

}


}













static int[][] compute(int matrix[][],long m,long n)
{
	 n=n-1;
	int y[][]={{1,0},{0,1}};
	while(n>0)
	{

			if(n%2!=0)
				y=multiply(y,matrix,m);
			matrix=multiply(matrix,matrix,m);
			n=n/2;



	}





return y;




}
static int[][] multiply(int matrix[][],int matrix1[][],long m)
{

int mul[][]=new int[2][2];
for(int i=0;i<2;i++)
{

for(int j=0;j<2;j++)
{
mul[i][j]=0;
for(int k=0;k<2;k++)
{
mul[i][j]+=(matrix[i][k]*matrix1[k][j])%m;


}

}


}

return mul;


}





}
