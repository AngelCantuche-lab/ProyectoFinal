package everisentidadesSQL.entidadesSQL.domain;


import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "nombre")
    private String nombre;

    @JsonIgnore
    private Direccion direccion;

    @Column(name = "estadoCliente")
    private String estado;

    @JsonIgnore
    private List<Visita> visita;

    public Cliente() {
    }

    public Cliente(int id, String nombre, Direccion direccion, String estado, List<Visita> visita) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.visita = visita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Visita> getVisita() {
        return visita;
    }

    public void setVisita(List<Visita> visita) {
        this.visita = visita;
    }
}
