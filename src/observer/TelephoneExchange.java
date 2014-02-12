package observer;
/**
 * Notas do padrao Observer 
 * Ele é aplicavel quando a mudanca de comportamento
 * de um objeto eh causada quando um outro objeto muda 
 * seu comportamento.
 * 
 * PARTICIPANTES 
 * ->SUBJECT 
 * --Conhece os seus observadores. Um número qualquer de 
 * objetos Observer pode observar um subject.
 * 
 * --fornece uma interface para acrescentar e remover objetos,
 * permitindo associar e desassociar objetos observer
 * 
 * ->OBSERVER (TelephoneListeners)
 * --Define uma interface de atualizacao para objetos que deverimam
 * ser notificados sobre mudancas em um subject 
 * 
 * 
 * ->CONCRETE SUBJECT (Telephone)
 * --Armazena estados de interesse para objetos ConcreteOberserve
 * --Envia uma notificacao para os seus observadores quando seu estado
 * muda 
 * 
 * ->CONCRETE OBSERVER (Person)
 * --Mantem uma referencia para um objeto concrete subject 
 * --Armazena estados que deveriam permencer consistentes com os do subject
 * --Implementa a interface de atualizacao de Observer, para manter seu estado 
 * consistente com o do subject.
 *  * @author ramon
 *
 */
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
