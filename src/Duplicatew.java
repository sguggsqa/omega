
public class Duplicatew {
	public static void main(String[] arg)
	{
		String s1="hello";
		String s2="hello12";
		String s3=new String("hello");
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s1==s2);
		
		
	}

}
