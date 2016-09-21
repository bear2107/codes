
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
   

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
           String s[]=br.readLine().split(" ");
           int n=Integer.parseInt(s[0]);
           int m=Integer.parseInt(s[1]);
           LinkedList<Integer> graph[]=new LinkedList[n+1];
           for(int y=1;y<=n;y++)
           graph[y]=new LinkedList<Integer>();
           
           while(m>0)
           {
            String se[]=br.readLine().split(" ");
            int l=Integer.parseInt(se[0]);
            int u=Integer.parseInt(se[1]);
            graph[l].add(u);
            graph[u].add(l);
            m--;
            
           }
           long brr[]=new long[n];
           boolean visited[]=new boolean[n];
           s=br.readLine().split(" ");
           for(int j=0;j<s.length;j++)
           brr[j]=Long.parseLong(s[j]);

        Stack<Integer> st=new Stack<Integer>();
          long max=0;
          long sum=0;
            for(int o=1;o<=n;o++)
            {
              if(visited[o-1]==false)
              {
                 st.push(o);
                 visited[o-1]=true;
                  sum=0;
                while(st.isEmpty()==false)
                {
                  int le=st.pop();
                  sum+=brr[le-1];
                  visited[le-1]=true;
                  Iterator<Integer> it = graph[le].iterator();
                  while(it.hasNext())
                  {
                  	int v=it.next();
                  
                  if(visited[v-1]==false)
                  {
                  	visited[v-1]=true;
                  	st.add(v);
                  }
                  }
                 
                  
                  
                  
                }
                
                
                
              }
              
              if(sum>max)
              max=sum;
              
            }
            System.out.println(max);
            
           
        }
      

       // System.out.println("Hello World!");
    }
    
}
