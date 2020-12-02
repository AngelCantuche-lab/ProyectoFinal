package everisentidadesSQL.entidadesSQL.domain;

import javax.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private Cliente cliente;

@Column(name= "poblacion")
private String poblacion;

@Column(name = "direccion")
private String direccion;

    public Direccion() {}

    public Direccion(int id, Cliente cliente, String poblacion, String direccion) {
        this.id = id;
        this.cliente = cliente;
        this.poblacion = poblacion;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
