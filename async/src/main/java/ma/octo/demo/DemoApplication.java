package ma.octo.demo;

import ma.octo.demo.beans.ApplicationContextProvider;
import ma.octo.demo.beans.AsyncBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
    public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        AsyncBean asyncBean = (AsyncBean) ApplicationContextProvider.getApplicationContext().getBean("asyncBean");
        asyncBean.performAComplexAction();
        logger.info("asyncBean called");
    }
}
