/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Dao.Crud_usuarios;
import dato.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.BD;

/**
 *
 * @author Labing I5
 */
public class Index extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String contrasena = request.getParameter("contrasena");

            usuario u = new usuario(firstname, lastname, phone, email, contrasena,0);
            BD b = new BD();
            b.addVenta(u);
            Crud_usuarios c = new Crud_usuarios();
            try {
                c.insert(b);
            } catch (SQLException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }

            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
    }
}
