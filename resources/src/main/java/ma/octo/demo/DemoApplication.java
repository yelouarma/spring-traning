package ma.octo.demo;

import ma.octo.demo.beans.ApplicationContextProvider;
import ma.octo.demo.beans.ResourcesBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ResourcesBean resourcesBean= (ResourcesBean) ApplicationContextProvider.getApplicationContext().getBean("resourcesBean");
		System.out.println(Arrays.toString(resourcesBean.loadUsingResourcePatternUtils("classpath:*.json")));
		System.out.println(Arrays.toString(resourcesBean.loadUsingPathMatchingResourcePatternResolver("classpath:*.json")));
		System.out.println(Arrays.toString(resourcesBean.loadUsingResourcePatternUtils("classpath:**/*.json")));
		System.out.println(Arrays.toString(resourcesBean.loadUsingPathMatchingResourcePatternResolver("classpath:**/*.json")));

	}
}
