package test.funcionalidade;

import jade.core.Agent;
import test.common.TestException;
import test.common.TestGroup;


public class FuncionalidadeTesterAgent extends test.common.TesterAgent {
	@Override
	public TestGroup getTestGroup() {
		
		TestGroup tg = new TestGroup("/test/funcionalidade/funcionalidadeTestList.xml")
		{
			public void initialize(Agent a) throws TestException
			{//Perform initialization common to all tests in the group
				
			}
			
			public void shutdown(Agent a)
			{//perform clean-up operations common to all tests in the group
				
			}
		};
		return tg;
	}

}
