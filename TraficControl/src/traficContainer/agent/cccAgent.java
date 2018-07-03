package traficContainer.agent;

import jade.core.Agent;
import jade.wrapper.ControllerException;

public class cccAgent extends Agent {
	@Override
	protected void setup() {
		System.out.println("initialisation of agent ccc");
		super.setup();
	}
	@Override
	protected void takeDown() {
		System.out.println("destruction of agent ccc");
		super.takeDown();
	}
	@Override
	protected void beforeMove() {
		try {
			System.out.println("Before the migration from " + this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.beforeMove();
	}
	@Override
	protected void afterMove() {
		try {
			System.out.println("Before the migration from " + this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		super.afterMove();
		}
	}
	
	
}
