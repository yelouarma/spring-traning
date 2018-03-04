package ma.octo.demo;

import ma.octo.demo.beans.ApplicationContextProvider;
import ma.octo.demo.beans.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ma.octo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		HelloBean helloBean= (HelloBean) ApplicationContextProvider.getApplicationContext().getBean("helloBean");
		helloBean.sayHello("OCTO");
	}
}
