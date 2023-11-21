package ie.atu.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) { this.personService = personService;}
    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId){
        return ResponseEntity.badRequest().body("EmployeeId is invalid");
    }
    Person person = personService.getPersonByEmployeeId(employeeId);

    if (person == null){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(person);
}
