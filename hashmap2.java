
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
     //sort names based on descending order of marks
    

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        List<String> names;
      Map<Integer,List<String>> a=new HashMap<Integer,List<String>>();
        for (int i = 0; i < N; i++) {
        	String s[]=br.readLine().split(" ");
        	String name=s[0];
        	int mar=Integer.parseInt(s[1]);
        	names=a.get(mar);
        	if(names==null)
        		a.put(mar,names=new ArrayList<String>() );
        		names.add(name);
        	}
   List<Integer> l=new ArrayList<Integer>(a.keySet());
   Collections.sort(l);
   Collections.reverse(l);
   for(int sort:l)
   {
   	
   	names=a.get(sort);
   	Collections.sort(names);
   	for(String nm:names)
   	System.out.println(nm+" "+sort);
   	
   }
   

    }
}
