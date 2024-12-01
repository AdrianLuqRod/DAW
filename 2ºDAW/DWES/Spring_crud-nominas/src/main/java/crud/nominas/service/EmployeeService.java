package crud.nominas.service;

import crud.nominas.IEmployeeRepository;
import crud.nominas.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static final double BASE_SALARY[] = {50000, 70000, 90000, 110000, 130000,
            150000, 170000, 190000, 210000, 230000};

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Transactional
    public boolean createEmployee(Employee employee) {
        try {
            Employee savedEmployee = employeeRepository.saveAndFlush(employee);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public boolean modifyEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findByDni(employee.getDni());

        if(existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setGender(employee.getGender());
            existingEmployee.setCategory(employee.getCategory());
            existingEmployee.setWork_years(employee.getWork_years());
            existingEmployee.setSalary(calculateSalary(employee));
            employeeRepository.saveAndFlush(existingEmployee);
            return true;
        }

        return false;
    }

    public boolean deleteEmployee(String dni) {
        Employee employee = employeeRepository.findByDni(dni);
        if(employee != null) {
            employeeRepository.delete(employee);
            return true;
        }
        return false;
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> searchEmployees(String name, String dni, String gender, Integer category, Integer workYears) {
        return employeeRepository.findByFilters(name, dni, gender, category, workYears);
    }

    public Employee getEmployeeByDni(String dni) {
        return employeeRepository.findByDni(dni);
    }

    public boolean existsEmployeeByDni(String dni) {
        Employee employee = employeeRepository.findByDni(dni);
        return employee != null;
    }


    public Double getSalaryByDni(String dni) {
        Employee employee = employeeRepository.findByDni(dni);
        return employee == null ? null : calculateSalary(employee);
    }

    public Double calculateSalary(Employee employee) {
        return BASE_SALARY[employee.getCategory() - 1] + (employee.getWork_years() * 5000);
    }


}