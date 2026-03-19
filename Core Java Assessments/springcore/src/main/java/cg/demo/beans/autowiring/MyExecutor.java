package cg.demo.beans.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.demo.SpringConf;

public class MyExecutor {

	public MyExecutor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] argStrings) {
		System.out.println("Starting Application");
//		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("springConf.xml");
        // implementation class for interface ApplicationContext is
        // ClassPathXmlApplicationContext
        AbstractApplicationContext ac = new AnnotationConfigApplicationContext(SpringConf.class);
//        ApplicationContext ac = new ClassPathXmlApplicationContext("springConf.xml");
        

//		ApplicationContext ac = new ClassPathXmlApplicationContext("springConf.xml");
		EmpFacility ef = ac.getBean(EmpFacility.class);
		ac.registerShutdownHook();
		System.out.println("Evaluated Bonus is: " + ef.getEbonus().evaluateBonus(50000));
		System.out.println("Closing Application");
	}

}
