
import java.io.BufferedReader;
import java.io.InputStreamReader;


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
