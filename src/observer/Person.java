package observer;

/*
 * eh a classe observer, conhecida como 
 * listener 
 */
public class Person  implements TelephoneListeners{
	
	public void observerTelephone(Telephone telephone)
	{
		/*
		 * nesse metodo voce manda o observador ficar 
		 * atendo na mundanca de estado de algum objeto
		 */
		telephone.setTelephoneListener(this);
	}

	@Override
	public void TelephoneTouched() {
	System.out.println("["+this+"] Eu Atendooooo....");
		
	}

}
