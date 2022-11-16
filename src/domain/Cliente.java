package domain;

import java.util.Date;
import java.util.Date;
public class Cliente extends Persona {

    private Date fechaRegistro;
    private int idCliente;
    private static int contadorCliente;
    private boolean vip;

    public Cliente(boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaRegistro = new java.util.Date();
    }

    public Date getDate() {
        return fechaRegistro;
    }

    public void setDate(Date date) {
        this.fechaRegistro = date;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{date=").append(fechaRegistro);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
