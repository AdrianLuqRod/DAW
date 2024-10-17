package nominas.crud.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import nominas.crud.dao.EmpleadoDaoImpl;
import nominas.crud.model.Empleado;
import nominas.crud.dao.EmpleadoDaoImpl;
import nominas.crud.model.Empleado;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(description = "administra peticiones para la tabla empleados", urlPatterns = {"/empresa"})
public class EmpleadoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmpleadoServlet() {

    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opcion = req.getParameter("opcion");
        HttpSession session = req.getSession();
        if(opcion.equals("crear")) {
            RequestDispatcher rd = req.getRequestDispatcher("/views/addEmpleado.jsp");
            rd.forward(req, resp);
        } else if(opcion.equals("listar")) {
            EmpleadoDaoImpl empleadoDaoImpl = EmpleadoDaoImpl.getInstance();
            try {
                List<Empleado> listaEmpl = empleadoDaoImpl.getAll();
                req.setAttribute("listaEmpl", listaEmpl);
                RequestDispatcher rd = req.getRequestDispatcher("/views/ListarTodo.jsp");
                rd.forward(req, resp);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }



    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String opcion = req.getParameter("opcion");
        if(opcion.equals("guardar")) {
            creaEmpleado(req, session);
            if(session.getAttribute("error") != null) {
                RequestDispatcher rd = req.getRequestDispatcher("/views/addEmpleado.jsp");
                rd.forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/empresa?opcion=listar");
            }
        }
    }

    private void creaEmpleado(HttpServletRequest req, HttpSession session) {
        EmpleadoDaoImpl emplDaoImpl = EmpleadoDaoImpl.getInstance();
        Empleado empl = null;
        try {
            if(validaParametros(req)) {
                empl = asignaParametros(req);
                emplDaoImpl.add(empl);
            } else {
                session.setAttribute("error", "Datos incorrectos");
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
    private boolean validaParametros(HttpServletRequest req) {
        if(req.getParameter("nombre").isEmpty() || req.getParameter("dni").isEmpty() ||
                req.getParameter("categoria").isEmpty() || req.getParameter("anyos").isEmpty() ||
                req.getParameter("sexo").isEmpty() || req.getParameter("sexo").length() > 1 ||
                req.getParameter("nombre") == null || req.getParameter("dni") == null ||
                req.getParameter("categoria") == null || req.getParameter("anyos") == null ||
                req.getParameter("sexo") == null) {
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
    private Empleado asignaParametros(HttpServletRequest req) {
        return new Empleado(req.getParameter("sexo").charAt(0),
                req.getParameter("dni"), req.getParameter("nombre"),
                Integer.parseInt(req.getParameter("categoria")),
                Integer.parseInt(req.getParameter("anyos")));
    }
}