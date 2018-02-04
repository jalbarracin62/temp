/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dato.usuario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Isabel-Fabian
 */
public class BD implements Serializable {

    private ArrayList<usuario> activos;

    public BD() {
        this.activos = new ArrayList<usuario>();

    }

    public void addVenta(usuario activo) {
        this.activos.add(activo);
    }

    public ArrayList<usuario> getActivos() {
        return activos;
    }

}
