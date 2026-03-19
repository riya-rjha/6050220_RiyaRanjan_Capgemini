package cg.demo.beans.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Manager implements EmpBonus{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double evaluateBonus(int salary) {
		System.out.println("According to the team, bonus is evaluated for Manager");
		return salary * 0.15;
	}

}
