package ma.octo.demo.beans;


import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public  void sayHello(String name){
        System.out.println("Hello "+name);
    }
}
