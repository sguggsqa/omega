
public class Customer extends Order {
	String cname;
	String lco;
	Order r;
	public Customer(String cname,String Loc,Order r)
	{
		super(r.id,r.name,r.price);
		this.cname=cname;
		this.lco=lco;
		
	}
	public void display()
	{
		System.out.println(this.cname+" "+r.price);
	}
	public static void main(String[] args)
	{
		Order r=new Order(10,12,231);
		System.out.println(r);
		String s1="hello",s2="word";
		s1=s1+s2;
		
		
	}
	
	

}
