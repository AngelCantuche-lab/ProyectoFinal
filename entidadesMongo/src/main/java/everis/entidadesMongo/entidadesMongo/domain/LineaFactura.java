package everis.entidadesMongo.entidadesMongo.domain;

import org.springframework.data.annotation.Id;

public class LineaFactura {

    private @Id
    Integer id;

    private Integer cliente;

    private double importeFactura;

    private String estados;

    private String factura;

    public LineaFactura(Integer cliente) {
        this.cliente = cliente;
    }

    public LineaFactura(Integer id, Integer cliente, double importeFactura, String estados, String factura) {
        this.id = id;
        this.cliente = cliente;
        this.importeFactura = importeFactura;
        this.estados = estados;
        this.factura = factura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public double getImporteFactura() {
        return importeFactura;
    }

    public void setImporteFactura(double importeFactura) {
        this.importeFactura = importeFactura;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
