package com.sample;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;
import org.tinylog.Logger;

public class ExtDep extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		// TODO Implement your mediation logic here 
		System.out.println("Hello from custom class mediator");
		Logger.info("======== External Dependency Added =========");
		System.out.println("Bye from custom class mediator");
		return true;
	}
}
