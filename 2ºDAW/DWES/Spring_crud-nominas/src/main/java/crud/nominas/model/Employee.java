package crud.nominas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "dni")
    private String dni;
    @Column (name = "gender")
    private String gender;
    @Column (name = "category")
    private int category;
    @Column (name = "work_years")
    private int work_years;

    private double salary;

    public Employee(String name, String dni, String gender, int category, int work_years) {
        super();
        this.name = name;
        this.dni = dni;
        this.gender = gender;
        this.category = category;
        this.work_years = work_years;
    }
}