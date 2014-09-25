package test.funcionalidade.tests;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import test.common.TestException;

public class TestCase1 extends test.common.Test {
	

	public Behaviour load(Agent a) throws TestException {// Perform test
															// specific
															// initialization
		
		Behaviour b = new CyclicBehaviour(a) {
			
		
			private static final long serialVersionUID = 1L;

			@Override
			public void action() 
			{
				ACLMessage msg=myAgent.receive();
				if(msg!=null)
				{
					ACLMessage reply =msg.createReply();
					
					if(msg.getPerformative()==ACLMessage.REQUEST)
					{
						String content = msg.getContent();
						
						if((content !=null)&&(content.indexOf("ping")!=-1))
						{
							reply.setPerformative(ACLMessage.INFORM);
							reply.setContent("pong");
						}else 
						{
							reply.setPerformative(ACLMessage.REFUSE);
							reply.setContent("O que eh isso ? "+content);
						}
					}else 
					{
						reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
						reply.setContent(" Nao compreendido "+ACLMessage.getPerformative(msg.getPerformative()));
						
					}
					myAgent.send(reply);	
					
				}else
				{
					block();
				}
			}
		};

		return b;
	}

	public void clean(Agent a) {

	}


}
