package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RaceCar implements Vehicle {
	
	static int c; // this is just for generating new car numbers
	
	private int number = ++c;

	@Override
	public void start() {
		System.out.println("starts RaceCar: " + number);
	}

	@Override
	public void goTo(String destination) {
		System.out.println("going to " + destination);
	}

	@Override
	public void stop() {
		System.out.println("stops RaceCar: " + number);
	}

}
