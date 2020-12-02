package everisentidadesSQL.entidadesSQL.domain;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table (name = "Visita")
public class Visita {
    static String[] estados={"Agendada","Pendiente","Facturada"};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Importe")
    private double importe;

    private String cliente;

    @Column (name = "estados")
    private List<String> listaEstados = Arrays.asList(estados);

    public Visita() { }

    public Visita(int id, double importe, String cliente, List<String> listaEstados) {
        this.id = id;
        this.importe = importe;
        this.cliente = cliente;
        this.listaEstados = listaEstados;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String[] getEstados() {
        return estados;
    }

    public static void setEstados(String[] estados) {
        Visita.estados = estados;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public List<String> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<String> listaEstados) {
        this.listaEstados = listaEstados;
    }
}
