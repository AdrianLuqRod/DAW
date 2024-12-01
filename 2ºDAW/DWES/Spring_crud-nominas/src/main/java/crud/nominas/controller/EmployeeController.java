package crud.nominas.controller;

import crud.nominas.model.Employee;
import crud.nominas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping ("/employees")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("list");
        List<Employee> employees = employeeService.getAllEmployees();
        Map<String, Double> salaries = new HashMap<>();
        for(Employee employee : employees) {
            salaries.put(employee.getDni(), employeeService.getSalaryByDni(employee.getDni()));
        }
        mav.addObject("employees", employees);
        mav.addObject("salary", salaries);
        return mav;
    }

    @GetMapping
    public String home() {
        return "index";
    }

    @PostMapping ("/employees/createEmployee")
    public String createEmployee(@RequestParam ("name") String name,
                                 @RequestParam ("dni") String dni,
                                 @RequestParam ("gender") String gender,
                                 @RequestParam ("category") int category,
                                 @RequestParam ("work_years") int work_years,
                                 Model model) {


        if(employeeService.existsEmployeeByDni(dni)) {
            model.addAttribute("error", "Employee with DNI " + dni + " already exists");
            return "list";

        }

        Employee employee = new Employee(name, dni, gender, category, work_years);
        employeeService.addEmployee(employee);

        return "redirect:/employees";
    }

    @GetMapping ("/employees/searchEmployees")
    public ModelAndView searchEmployees(@RequestParam (required = false) String name,
                                        @RequestParam (required = false) String dni,
                                        @RequestParam (required = false) String gender,
                                        @RequestParam (required = false) Integer category,
                                        @RequestParam (required = false) Integer work_years) {
        if(dni != null && dni.trim().isEmpty()) dni = null;
        if(gender != null && gender.isEmpty()) gender = null;
        if(category != null && category == 0) category = null;
        if(work_years != null && work_years == 0) work_years = null;

        List<Employee> foundEmployees = employeeService.searchEmployees(name, dni, gender, category, work_years);

        ModelAndView mav = new ModelAndView("searchEmployees");
        mav.addObject("foundEmployees", foundEmployees);

        return mav;
    }

    @GetMapping ("/employees/{dni}")
    public Employee getEmployeeByDni(@PathVariable String dni) {
        return employeeService.getEmployeeByDni(dni);
    }


    @GetMapping ("/employees/searchSalary")
    public ModelAndView searchSalary(@RequestParam (required = false) String dni) {
        if(dni == null || dni.trim().isEmpty()) {
            return new ModelAndView("searchSalary").addObject("error", "Dni is required");
        }

        Employee employee = employeeService.getEmployeeByDni(dni);
        if(employee == null) {

            return new ModelAndView("searchSalary").addObject("error", "Employee with DNI "
                    + dni + " not found");
        }

        double salary = employeeService.calculateSalary(employee);
        ModelAndView mav = new ModelAndView("searchSalary");
        mav.addObject("employee", employee);
        mav.addObject("salary", salary);

        return mav;
    }

    @GetMapping ("/employees/showSearchForm")
    public ModelAndView showSearchForm() {
        return new ModelAndView("searchSalary");
    }

    @GetMapping ("/employees/showCreateForm")
    public ModelAndView showCreateForm() {
        return new ModelAndView("addEmployee");
    }

    @PostMapping ("/employees/updateEmployee")
    public String updateEmployee(@RequestParam ("name") String name,
                                 @RequestParam ("dni") String dni,
                                 @RequestParam ("gender") String gender,
                                 @RequestParam ("category") int category,
                                 @RequestParam ("work_years") int work_years,
                                 Model model) {
        if(!employeeService.existsEmployeeByDni(dni)) {
            model.addAttribute("error", "Employee with DNI " + dni + " not found");
            return "list";
        }
        Employee employee = new Employee(name, dni, gender, category, work_years);
        boolean success = employeeService.modifyEmployee(employee);

        if(success) {
            return "redirect:/employees";
        }
        model.addAttribute("error", "Error updating employee");
        return "list";
    }

    private String loadEmployee(String dni, Model model) {
        Employee employee = employeeService.getEmployeeByDni(dni);
        if(employee == null) {
            model.addAttribute("error", "Employee not found");
            return "redirect:/employees";
        }
        model.addAttribute("employee", employee);

        return "editEmployee";
    }

    @GetMapping ("/employees/edit/{dni}")
    public ModelAndView editEmployee(@PathVariable String dni) {
        Employee employee = employeeService.getEmployeeByDni(dni);
        if(employee == null) {

            return new ModelAndView("editEmployee").addObject("error", "Employee not found");
        }

        return new ModelAndView("editEmployee").addObject("employee", employee);
    }

    @GetMapping ("/employees/delete/{dni}")
    public String deleteEmployee(@PathVariable String dni, Model model) {
        if(!employeeService.existsEmployeeByDni(dni)) {
            model.addAttribute("error", "Employee with DNI " + dni + " not found");
            return "list";
        }
        boolean success = employeeService.deleteEmployee(dni);
        if(success) {
            return "redirect:/employees";
        } else {
            model.addAttribute("error", "Error deleting employee");
            return "list";
        }
    }
}