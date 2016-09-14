import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 //program to find the no of smaller elements to the right of array using inversion pairs
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int weight[]=new int[1000000];
        for (int e = 0; e < n; e++) 
        {
        	for(int ef = 0; ef < 1000000; ef++)
        	weight[ef]=0;
        	int x=  Integer.parseInt(br.readLine());
        	
        	int a[]=new int[x];
        		int b[]=new int[x];
        	int i=0;
        for(int j=0;j<x;j++)
            {
            	a[j]=Integer.parseInt(br.readLine());
            	b[j]=a[j];
          
            }
            
            new TestClass().merge_sort(a,weight,0,a.length-1);
            
           for(int u=0;u<x;u++)
            	{
            	System.out.print(weight[b[u]-1]+" ");
            	}
            	System.out.println("");
            }
            
        }
        void merge_sort(int a[],int weight[],int start,int end)
  {
      if(start<end)
      {
        int mid=(start+(end-start)/2);
        merge_sort(a,weight,start,mid);
        merge_sort(a,weight,mid+1,end);
        merge(a,weight,start,mid,end);
        }
      
  }
  void merge(int a[],int weight[],int start,int mid,int end)
  {
      int p=start;
      int q=mid+1;
      int arr[]=new int[end-start+1];
      int k=0;
      for(int i=start;i<=end;i++)
      {
          if(p>mid)
          {
          arr[k]=a[q];
          q++;
          }
          else if(q>end)
          {
          arr[k]=a[p];
          p++;
          }
          else if(a[p]>a[q])
          {
          	weight[a[p]-1]+=end-q+1;
          	arr[k]=a[p];
          p++;
          }
          else
          {
          arr[k]=a[q];
          q++;
          }
          k++;
          }
      for(int u=0;u<k;u++)
      {
          a[start++]=arr[u];
      }
  }
      }
