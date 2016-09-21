
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
            int k=Integer.parseInt(s[1]);
            PriorityQueue<Long> p=new PriorityQueue<Long>(n,new Comparator<Long>()
            {
            	public int compare(Long a,Long b)
            	{
            		return b.compareTo(a);
            	}
            	
            	
            	
            });
           s=br.readLine().split(" ");
           for(int o=0;o<n;o++)
           p.add(Long.parseLong(s[o]));
           long sum=0;
           while(k!=0)
           {
           	long xe=p.peek();
           	sum+=xe;
           	p.remove();
           	p.add((long)xe/2);
           	k--;
           	
           }
           
        
     

        System.out.println(sum);
    }
}
}
