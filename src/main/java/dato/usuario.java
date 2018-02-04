/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author JCBOT
 */
public class usuario {

    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String Passwordd;
    private int Nreguistro;

    public usuario(String firstname, String lastname, String phone, String email, String Passwordd, int Nreguistro) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.Passwordd = Passwordd;
        this.Nreguistro = Nreguistro;
    }

    public usuario() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordd() {
        return Passwordd;
    }

    public void setPasswordd(String Passwordd) {
        this.Passwordd = Passwordd;
    }

    public int getNreguistro() {
        return Nreguistro;
    }

    public void setNreguistro(int Nreguistro) {
        this.Nreguistro = Nreguistro;
    }

   

}
