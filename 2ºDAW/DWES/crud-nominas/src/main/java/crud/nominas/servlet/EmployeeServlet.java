package crud.nominas.servlet;

import crud.nominas.dao.EmployeeDaoImpl;
import crud.nominas.model.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet (description = "Employee Servlet", urlPatterns = {"/empresa"})
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmployeeServlet() {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        HttpSession session = req.getSession();
        if(option.equals("create")) {
            RequestDispatcher rd = req.getRequestDispatcher("/views/addEmployee.jsp");
            rd.forward(req, resp);
        } else if(option.equals("listing")) {
            EmployeeDaoImpl empleadoDaoImpl = EmployeeDaoImpl.getInstance();
            try {
                List<Employee> employeeList = empleadoDaoImpl.getAll();
                System.out.println(employeeList);
                req.setAttribute("EmployeeList", employeeList);
                RequestDispatcher rd = req.getRequestDispatcher("/views/allEmployee.jsp");
                rd.forward(req, resp);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else if(option.equals("salary")) {
            //TODO: NI PUTA IDEA
            //TODO: NI PUTA IDEA
            //TODO: NI PUTA IDEA
            RequestDispatcher rd = req.getRequestDispatcher("/views/searchSalary.jsp");
            rd.forward(req, resp);
            EmployeeDaoImpl emplDaoImpl = EmployeeDaoImpl.getInstance();
            try {
                Employee empl = emplDaoImpl.getByDni(req.getParameter("dni"));
                req.setAttribute("Employee", empl);
                rd = req.getRequestDispatcher("/views/searchSalary.jsp");
                rd.forward(req, resp);
            } catch(Exception ex) {
                ex.printStackTrace();
            }

        } else if(option.equals("search")) {

        }
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String option = req.getParameter("option");
        if(option.equals("save")) {
            pushEmployee(req, session);
            if(session.getAttribute("error") != null) {
                RequestDispatcher rd = req.getRequestDispatcher("/views/addEmployee.jsp");
                rd.forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/empresa?option=listing");
            }
        } else if(option.equals("searchSalary")) {
            searchSalary(req, session);
            if(session.getAttribute("error") != null || session.getAttribute("error2") != null) {
                RequestDispatcher rd = req.getRequestDispatcher("/views/searchSalary.jsp");
                rd.forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/empresa?option=searchSalary");
            }
        }
    }

    /**
     * Create an Employee object and add it to the database.
     *
     * @param req
     * @param session
     */
    private void pushEmployee(HttpServletRequest req, HttpSession session) {
        EmployeeDaoImpl emplDaoImpl = EmployeeDaoImpl.getInstance();
        Employee empl = null;
        try {
            if(isValidParams(req, session)) {
                empl = assignParams(req);
                emplDaoImpl.add(empl);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Validate the parameters received from the form.
     *
     * @param req
     * @return True if the parameters are correct.
     */
    private boolean isValidParams(HttpServletRequest req, HttpSession session) {
        System.out.println(req.getParameter("name") + " " + req.getParameter("dni") + " "
                + req.getParameter("category") + " " + req.getParameter("workingYears") + " "
                + req.getParameter("gender"));
        if(req.getParameter("name") == null || req.getParameter("name").isEmpty() ||
                req.getParameter("dni") == null || req.getParameter("dni").isEmpty() ||
                req.getParameter("category") == null || req.getParameter("category").isEmpty() ||
                req.getParameter("workingYears") == null || req.getParameter("workingYears").isEmpty() ||
                req.getParameter("gender") == null || req.getParameter("gender").isEmpty()) {

            session.setAttribute("error", "Invalid parameters");
            return false;
        }
        return true;
    }


    /**
     * Assign the parameters received from the form to an Employee object.
     *
     * @param req
     * @return Employee object.
     */
    private Employee assignParams(HttpServletRequest req) {
        return new Employee(req.getParameter("gender").charAt(0),
                req.getParameter("dni"), req.getParameter("name"),
                Integer.parseInt(req.getParameter("category")),
                Integer.parseInt(req.getParameter("workingYears")));
    }

    private Employee searchSalary(HttpServletRequest req, HttpSession session) {
        EmployeeDaoImpl emplDaoImpl = EmployeeDaoImpl.getInstance();
        Employee empl = null;
        try {
            if(isValidParams(req, session) && !isEmployeeExisting(req.getParameter("dni"))) {
                empl = emplDaoImpl.getByDni(req.getParameter("dni"));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        if(empl == null) {
            session.setAttribute("error2", "Employee not found");
        }

        return empl;
    }

    private boolean isEmployeeExisting(String dni) {
        EmployeeDaoImpl emplDaoImpl = EmployeeDaoImpl.getInstance();
        try {
            if(emplDaoImpl.getByDni(dni) != null) {
                return true;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}