package crud.nominas.model;

import crud.nominas.exceptions.DatosNoCorrectosException;
import crud.nominas.model.Payroll;

public class Employee {
    private String name, dni;
    private char gender;
    private int category, workYears, salary;

    /**
     * Employee Constructor with all the parameters.
     *
     * @param gender    Employee gender
     * @param dni       Employee's DNI
     * @param name      Employee's name
     * @param category  Employee's category. Must be between 1 and 10.
     * @param workYears Employee's workYears. Must be positive.
     * @throws DatosNoCorrectosException if the category is not between 1 and 10 or if the number of years is negative.
     */
    public Employee(char gender, String dni, String name, int category, int workYears) {
        if(category < 1 || category > 10 || workYears < 0) {
            throw new DatosNoCorrectosException("Invalid data");
        }
        this.name = name;
        this.dni = dni;
        this.gender = gender;
        this.category = category;
        this.workYears = workYears;
        this.salary = new Payroll().calculateSalary(this);
    }

    public Employee(char gender, String dni, String name) {
        this.name = name;
        this.dni = dni;
        this.gender = gender;
        this.category = 1;
        this.workYears = 0;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getWorkYears() {
        return workYears;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", gender=" + gender +
                ", category=" + category +
                ", workYears=" + workYears +
                '}';
    }
}