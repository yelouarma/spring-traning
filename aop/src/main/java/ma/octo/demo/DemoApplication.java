package ma.octo.demo;

import ma.octo.demo.beans.ApplicationContextProvider;
import ma.octo.demo.beans.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoBean helloBean= (DemoBean) ApplicationContextProvider.getApplicationContext().getBean("demoBean");
		helloBean.perform("INIT_TRANSFER");
		helloBean.handleEvent("TRANSFER_REJECTED");
		helloBean.getName();
		helloBean.fail();
	}
}
