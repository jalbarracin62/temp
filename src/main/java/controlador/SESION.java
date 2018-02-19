/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Dao.Crud_usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Labing I5
 */
public class SESION extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            int i2 = 0;

            try {
                Crud_usuarios c = new Crud_usuarios();
                for (int i = 0; i < c.findAll().size(); i++) {

                    if (c.findAll().get(i).getEmail().equals(usuario) && c.findAll().get(i).getPasswordd().equals(password)) {

                        String nregistro = String.valueOf(c.findAll().get(i).getNreguistro());
                        String temp = "proyectos" + nregistro + ".jsp";
                        request.getRequestDispatcher(temp).forward(request, response);
                        i2++;

                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(SESION.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (i2 == 0) {
                String mensaje_alerta = "La contraseña ingresada es incorrecta intentalo de nuevo";
                request.setAttribute("mensaje_alerta", mensaje_alerta);
                request.getRequestDispatcher("sesion.jsp").forward(request, response);

            }

        }
    }
}
