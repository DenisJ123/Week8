package ie.atu.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Invalid Title")
    private String title;

    @NotBlank(message = "Invalid Employee Id")
    private String employeeId;

    @NotBlank
    private String department;

    @Min(18)
    private Integer age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Invalid position")
    private String position;

}
