
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Big Chandan is a dire lover of Biryani, especially Old Monk's Biryani. Today, he went over to have some of it. To his surprise, the waiter turns out be to be a coding geek and refuses to serves him unless Chandu solves his two- arrays problem, stated as:

Given two non-increasing array of integers A,B i.e A[i] >= A[i+1] and B[i] >= B[i+1] and for all i, 0 ≤ i < n-1.

The monkiness of two numbers is given by: M (A[i],B[j]) = j - i , if j >=i and B[j] >= A[i], or 0 otherwise. 


Find the monkiness of the two arrays, that is given by: M (A,B)= max (M(A[i],B[j])) for 0≤ i, j< n-1.

*/

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	int x=Integer.parseInt(br.readLine());
        	long arr[]=new long[x];
        	long brr[]=new long[x];
        	String se[]=br.readLine().split(" ");
            for(int o=0;o<se.length;o++)
            	arr[o]=Long.parseLong(se[o]);
            se=br.readLine().split(" ");
            for(int o=0;o<se.length;o++)
            	brr[o]=Long.parseLong(se[o]);
            int max=0;
            for(int j=0;j<arr.length;j++)
            {

            	int ans=0;
            	int low=j;
            	int high=brr.length-1;
            	while(low<=high)
            	{
            		int mid=low+(high-low)/2;
            		if(brr[mid]>=arr[j])
            		{
            			low=mid+1;
            			ans=mid;
            		}
            		else
            			if(brr[mid]<=arr[j])
            		{
            			high=mid-1;
            			
            		}
            		if(ans-j>max)
            			max=ans-j;

            	}
            	




            }

System.out.println(max);
        }
        

       // System.out.println("Hello World!");
    }
}
