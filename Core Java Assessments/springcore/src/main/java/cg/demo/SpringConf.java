package cg.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// source file which has all beans definitions

@Configuration
@ComponentScan("cg.demo.beans.autowiring")
//<context:component-scan base-package="cg.demo.beans.autowiring"/>

public class SpringConf {

	public SpringConf() {
		// TODO Auto-generated constructor stub
	}

}
