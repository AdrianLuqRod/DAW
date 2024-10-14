package nominas.crud.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import nominas.crud.dao.EmpleadoDAO;
import nominas.crud.model.Empleado;

@WebServlet (description = "administra peticiones para la tabla empleados", urlPatterns = {"/empleados"})
public class EmpleadoController extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoController() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String opcion = request.getParameter("opcion");
        HttpSession session = request.getSession();
        if(opcion.equals("listar")){
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            List<Empleado> lista = new ArrayList<>();
            try {
                lista = empleadoDAO.obtenerEmpleados();
                for(Empleado empleado : lista) {
                    System.out.println(empleado);
                }
                request.setAttribute("lista", lista);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/listarTodo.jsp");
                requestDispatcher.forward(request, response);
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        else if(opcion.equals("empl")){

        }else if(opcion.equals("salario")){

        }
    }
}