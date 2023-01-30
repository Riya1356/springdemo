package process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {


    private Vehicle vehicle;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle=vehicle;

    }
}
