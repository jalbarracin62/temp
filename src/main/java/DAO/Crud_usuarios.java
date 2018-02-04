/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import dato.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import servicios.BD;

/**
 *
 * @author JCBOT
 */
public class Crud_usuarios {

    public List<usuario> findAll() throws SQLException {
        List<usuario> departamentos = null;
        String query = "SELECT * FROM Usuarios";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            String firstname = null;
            String lastname = null;
            String phone = null;
            String email = null;
            String Passwordd = null;
            int nreguistro=0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<usuario>();
                }

                usuario registro = new usuario();

                firstname = rs.getString("firstname");
                registro.setFirstname(firstname);

                lastname = rs.getString("lastname");
                registro.setLastname(lastname);

                phone = rs.getString("phone");
                registro.setPhone(phone);

                email = rs.getString("email");
                registro.setEmail(email);

                Passwordd = rs.getString("Passwordd");
                registro.setPasswordd(Passwordd);
                
                nreguistro=rs.getInt("Nreguistro");
                registro.setNreguistro(nreguistro);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(BD t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Usuarios (firstname,lastname,phone,email,Passwordd) " + "values (?,?,?,?,?)";

        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);

            for (int i = 0; i < t.getActivos().size(); i++) {

                preparedStmt.setString(1, t.getActivos().get(i).getFirstname());
                preparedStmt.setString(2, t.getActivos().get(i).getLastname());
                preparedStmt.setString(3, t.getActivos().get(i).getPhone());
                preparedStmt.setString(4, t.getActivos().get(i).getEmail());
                preparedStmt.setString(5, t.getActivos().get(i).getPasswordd());

            }

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
