package ma.octo.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {


    public void perform(String action) {
        System.out.println("Performin action " + action);
    }

    public void handleEvent(String event) {
        System.out.println("Handling event " + event);
    }

    public String getName() {
        return "DemoBean";
    }

    public void fail() {
       throw new RuntimeException("Failing");
    }
}
