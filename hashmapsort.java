
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
     

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String s=br.readLine();
            HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
            for(int j=97;j<=122;j++)
         {   
            char v=(char)j;
            hm.put(v,0);
         }
            for(int j=0;j<s.length();j++)
            {
                hm.put(s.charAt(j),hm.get(s.charAt(j))+1);
                
                
            }
            Set<Map.Entry<Character,Integer>> set=hm.entrySet();
            List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character,Integer>>(set);
            Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
                
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b)
                {
                  
                   int x= a.getValue().compareTo(b.getValue());
                   if(x==0)
                   return b.getKey().compareTo(a.getKey());
                   else
                   return x;
                }
            });
            
            for(Map.Entry<Character,Integer> entry:list)
            System.out.print(entry.getKey()+" ");
            System.out.println();
        }
     

       // System.out.println("Hello World!");
    }
}
