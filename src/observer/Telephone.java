package observer;


public class Telephone {
/*
 * esse eh a classe observada
 * conhecida como source ou subject 
 */
	
	private TelephoneListeners listener;
	
	public void setTelephoneListener (TelephoneListeners listener)
	{
		this.listener=listener;
	}
	
	public void isTouched()
	{
		
		listener.TelephoneTouched();
	}
}
