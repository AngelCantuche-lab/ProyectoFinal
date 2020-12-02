package everis.entidadesMongo.entidadesMongo.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("factura")
public class Factura {

    @Id
    private String id;

    private String formaPago;

    private Integer cliente;

    private List<Integer> lineasFactura;

    private double importe;

    private String estados;

    public Factura(Integer cliente) {
        this.cliente = cliente;
    }

    public Factura(String id, String formaPago, Integer cliente, List<Integer> lineasFactura, double importe, String estados) {
        this.id = id;
        this.formaPago = formaPago;
        this.cliente = cliente;
        this.lineasFactura = lineasFactura;
        this.importe = importe;
        this.estados = estados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public List<Integer> getLineasFactura() {
        return lineasFactura;
    }

    public void setLineasFactura(List<Integer> lineasFactura) {
        this.lineasFactura = lineasFactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }
}
