package io.maddennis.mapstruct.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(
        name = "emp_tbl",
        indexes = {@Index(columnList = "email_id")},
        uniqueConstraints = {@UniqueConstraint(columnNames = {"email_id"})}
)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    @Max(50)
    private String firstName;
    @Column(name = "last_name")
    @Max(50)
    private String lastName;
    @Email
    @Column(name = "email_id")
    private String email;
    @Column(name = "password")
    @Min(8)
    private String password;
    @Max(13)
    @Min(10)
    @Column(name = "phone_number")
    private String phoneNumber;
}
