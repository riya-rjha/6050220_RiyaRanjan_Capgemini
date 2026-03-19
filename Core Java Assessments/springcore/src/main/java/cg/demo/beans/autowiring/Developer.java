package cg.demo.beans.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Developer implements EmpBonus	{

	public Developer() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public double evaluateBonus(int salary)  {
		System.out.println("According to project, bonus is evaluated for Developer");
		return salary * 0.10;
	}
	
}
