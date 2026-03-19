package cg.demo.beans.autowiring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//When prototype scope is made, destroy scope is not called, 
//as ApplicationContext manages destruction of beans
//only when it is of Singleton type

@Component
//@Scope("prototype")
public class EmpFacility implements InitializingBean, DisposableBean {
	@Autowired
	@Qualifier("manager")
	private EmpBonus ebonus;

	public EmpBonus getEbonus() {
		return ebonus;
	}

	public void setEbonus(EmpBonus ebonus) {
		this.ebonus = ebonus;
	}

	public EmpFacility() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of EmpFacility");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is disposable beans methods: destroy");

	}

	@Override
//	Invoked by the containing BeanFactory after it has set all bean properties and satisfied
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is initializing beans methods: afterPropertiesSet");

	}
	
	@PostConstruct
	public void customInt() {
		System.out.println("Custom init method");
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("Custom destroy method");
	}

}
