package ma.octo.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DemoService {

    @Value("${db.url:default}")
    private String dbUrl;

    @PostConstruct
    public void init() {
        System.out.println("Database URL is " + dbUrl);
    }
}
