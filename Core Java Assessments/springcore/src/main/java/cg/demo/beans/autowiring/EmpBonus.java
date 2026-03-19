package cg.demo.beans.autowiring;

import org.springframework.stereotype.Component;

@Component
public interface EmpBonus {
	double evaluateBonus(int salary);
}
