package observer;

public class TelephoneExchange {
	/* 
	 * eh a central telefonica 
	 * 
	 */
	
	public static void main(String args[])
	{
		Telephone tl = new Telephone();
		Person fulano=new Person();
		Person siclano=new Person();
		Telephone tl2=new Telephone();
		
		fulano.observerTelephone(tl);
		siclano.observerTelephone(tl2);
		
		tl.isTouched();
		tl2.isTouched();
		
	}

}
