package springcontentnegotiation.springcontentnegotiation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public Employee get(){
        Employee employee = new Employee();
        employee.setId("123");
        employee.setName("Vijay");
        return employee;
    }

}
