import java.util.HashMap;
import java.util.Set;

public class duplicate {
	public static void getduplicatechar(String s1)
	{
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	for(int i=0;i<s1.length();i++)
	{
		if(map.containsKey(s1.charAt(i)))
				{
			map.put(s1.charAt(i),map.get(s1.charAt(i))+1 );
				}
		else
		{
			map.put(s1.charAt(i),1);
		}
		
	}
	Set<Character> value=map.keySet();
	for(Character c:value)
	{
		if(map.get(c)>1 & (c!=' '))
			System.out.println("The duplicate Charecter "+c+"    nuber of time appears "+map.get(c));
	}
	}
public static void  main(String[] a)
{
	getduplicatechar("he me enter even");
	
}
}
