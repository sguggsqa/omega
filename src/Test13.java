
public class Test13 {
	int id,balance=0;
	//int amount;
	String name;
	Test13(int id,String name)
	{
		this.id=id;
		//this.amount=amount;
		this.name=name;
	}
	void deposit(int amount)
	{
		balance=amount;

	}
	String withddrawl(int amount)
	{
	if(amount<balance)
	{
		balance=balance-amount;
		return("sufficent balcne to withdrawal");
	}
	else
	{
		return("insufficient balance");
		
	}
	}
	void display()
	{
		System.out.println("the acct statement "+this.id+" "+this.name+" "+this.withddrawl(500));
	}


public static void main(String[] arggs)
{
	Test13 obj=new Test13(123,"venjat");
	obj.deposit(100);
	//obj.withddrawl(50);
	obj.display();
	
}
}
