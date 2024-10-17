package com.aprendec.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aprendec.dao.ProductoDAO;
import com.aprendec.model.Producto;

/**
 * Servlet implementation class ProductoController
 */
@WebServlet (description = "administra peticiones para la tabla productos", urlPatterns = {"/productos"})
public class ProductoController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     *
    public ProductoController() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String opcion = request.getParameter("opcion");
        HttpSession session = request.getSession();

        if(opcion.equals("crear")) {
            System.out.println("Usted a presionado la opcion crear");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/crear.jsp");
            requestDispatcher.forward(request, response);
        } else if(opcion.equals("listar")) {

            ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> lista = new ArrayList<>();
            try {
                lista = productoDAO.obtenerProductos();
                for(Producto producto : lista) {
                    System.out.println(producto);
                }

                request.setAttribute("lista", lista);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/listar.jsp");
                requestDispatcher.forward(request, response);

            } catch(SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Usted a presionado la opcion listar");
        } else if(opcion.equals("meditar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            System.out.println("Editar id: " + id);
            ProductoDAO productoDAO = new ProductoDAO();
            Producto p = new Producto();
            try {
                p = productoDAO.obtenerProducto(id);
                System.out.println(p);
                request.setAttribute("producto", p);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editar.jsp");
                requestDispatcher.forward(request, response);

            } catch(SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else if(opcion.equals("eliminar")) {
            ProductoDAO productoDAO = new ProductoDAO();
            int id = Integer.parseInt(request.getParameter("id"));
            try {
                productoDAO.eliminar(id);
                System.out.println("Registro eliminado satisfactoriamente...");
                session.setAttribute("error", "Registro eliminado satisfactoriamente...");
                response.sendRedirect(request.getContextPath() + "/productos?opcion=listar");
            } catch(SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
        // response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String opcion = request.getParameter("opcion");
        Date fechaActual = new Date();

        if(opcion.equals("guardar")) {
            creaProducto(request, session, fechaActual);
            if(session.getAttribute("error") != null) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/crear.jsp");
                requestDispatcher.forward(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/productos?opcion=listar");
            }
        } else if(opcion.equals("editar")) {
            modificaProducto(request, response, session, fechaActual);
            if(session.getAttribute("error") != null) {
                response.sendRedirect(request.getContextPath() + "/productos?opcion=meditar&id=" +
                        request.getParameter("id"));
            } else {
                response.sendRedirect(request.getContextPath() + "/productos?opcion=listar");
            }
        }
        // doGet(request, response);
    }

    /**
     * Crea un producto en la base de datos con los datos del formulario de crear.jsp
     *
     * @param request
     * @param session
     * @param fechaActual
     */
    private void creaProducto(HttpServletRequest request, HttpSession session, Date fechaActual) {
        try {
            ProductoDAO productoDAO = new ProductoDAO();
            Producto producto = new Producto();
            if(request.getParameter("nombre").isEmpty() || request.getParameter("cantidad").isEmpty() ||
                    request.getParameter("precio").isEmpty()) {
                session.setAttribute("error", "Los campos no deben estar vacios");
            } else {
                producto.setNombre(request.getParameter("nombre"));
                producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
                producto.setPrecio(Double.parseDouble(request.getParameter("precio")));
                producto.setFechaCrear(new java.sql.Date(fechaActual.getTime()));
                if(productoDAO.existeProducto(producto.getNombre())) {
                    session.setAttribute("error", "El producto ya existe");
                } else {
                    productoDAO.guardar(producto);
                    System.out.println("Registro guardado satisfactoriamente...");
                    session.setAttribute("exito", "Producto guardado satisfactoriamente...");
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Modifica un producto en la base de datos con los datos del formulario de editar.jsp
     *
     * @param request
     * @param response
     * @param session
     * @param fechaActual
     */
    private void modificaProducto(HttpServletRequest request, HttpServletResponse response, HttpSession session, Date fechaActual) {
        try {
            ProductoDAO productoDAO = new ProductoDAO();
            Producto producto = new Producto();
            Producto productoOld = productoDAO.obtenerProducto(Integer.parseInt(request.getParameter("id")));

            if(request.getParameter("nombre").isEmpty() || request.getParameter("cantidad").isEmpty() ||
                    request.getParameter("precio").isEmpty()) {
                session.setAttribute("error", "Los campos no deben estar vacios");
            } else if(productoDAO.existeProducto(request.getParameter("nombre")) && !(productoOld.getNombre().equals(request.getParameter("nombre")))) {
                session.setAttribute("error", "El producto ya existe");
            } else {
                producto.setId(Integer.parseInt(request.getParameter("id")));
                producto.setNombre(request.getParameter("nombre"));
                producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
                producto.setPrecio(Double.parseDouble(request.getParameter("precio")));
                producto.setFechaActualizar(new java.sql.Date(fechaActual.getTime()));
                productoDAO.editar(producto);
                System.out.println("Registro modificado satisfactoriamente...");
                session.setAttribute("exito", "Producto modificado satisfactoriamente...");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}