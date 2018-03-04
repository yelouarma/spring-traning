package ma.octo.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.management.relation.RoleUnresolved;

@Component
public class AsyncBean {
    public static Logger logger = LoggerFactory.getLogger(AsyncBean.class);

    @Async
    public void performAComplexAction() {
        try {
            Thread.sleep(2000);
            logger.info("Action performed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
