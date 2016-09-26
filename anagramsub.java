import java.io.*;
class anagram
{
	public static void main(String args[])throws IOException
	{

		/*
		Our hacker, Little Stuart lately has been fascinated by ancient puzzles.
		 One day going through some really old books he finds something scribbled on the corner of a page. 
		 Now Little Stuart believes that the scribbled text is more mysterious than it originally looks, so he decides to find every occurrence of all 
		 the permutations of the scribbled text in the entire book. 
		 Since this is a huge task, Little Stuart needs your help, he needs you to only figure out if any 
		 permutation of the scribbled text exists in the given text string, so he can save time and analyze only 
		 those text strings where a valid permutation is present.*/
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
			n--;
			String s1=br.readLine();
			String s2=br.readLine();
			int arr[]=new int[26];
			int brr[]=new int[26];
			for(int i=0;i<s1.length();i++)
				arr[s1.charAt(i)-'a']++;
			for(int i=0;i<s1.length();i++)
				brr[s2.charAt(i)-'a']++;

			boolean found=false;
			for(int j=s1.length();j<s2.length();j++)
			{
				found=true;

				for(int i=0;i<26;i++)
				{
					if(arr[i]!=brr[i])
					{
						found=false;
						break;
					}
				}
				if(found==false)
				{

					brr[s2.charAt(j-s1.length())-'a']--;
					brr[s2.charAt(j)-'a']++;
				}

				else
				{
					System.out.println("YES");
					break; 
				}


			}

if(found==false)
{
	found=true;
for(int i=0;i<26;i++)
				{
					if(arr[i]!=brr[i])
					{
						found=false;
						System.out.println("NO");
						break;
					}
				}
				if(found==true)
					System.out.println("YES");

}

		}


	}
}
