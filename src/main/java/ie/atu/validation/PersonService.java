package ie.atu.validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public void savePerson(Person person) {
        System.out.println("Person Saved: " + person);
    }
    public Person getPersonByEmployeeId(String employeeId){
        return new Person();
    }

}
