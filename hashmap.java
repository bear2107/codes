
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            int n=Integer.parseInt(br.readLine());
            HashMap<String,String> hm=new HashMap<String,String>();
            while(n>0)
            {
            	String h=br.readLine();
            	hm.put(h,h);
            	n--;
            	
            }
     //Method 1 to traverse       
          Map<String,String> hmap=new TreeMap<String,String>(hm); //sorting on keys
          
            for(Map.Entry<String,String> entry:hmap.entrySet())
            {
            	System.out.println(entry.getValue());
            	
            	
            }
            
     //Method 2 to traverse
  /*   {
     	
     	Set set2 = hmap.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }
     	
     }*/
            
        }
     

     //   System.out.println("Hello World!");
    }
}
