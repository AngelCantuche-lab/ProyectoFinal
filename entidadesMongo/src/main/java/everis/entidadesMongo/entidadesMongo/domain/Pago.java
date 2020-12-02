package everis.entidadesMongo.entidadesMongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document("Pago")
public class Pago {

        @Id
        private String id;

        @DateTimeFormat(pattern = "yyyy/MM/dd")
        private Date paymentDate;

        private double dinero;

        private String estado;

        private String factura;

        public Pago(double dinero) {
                this.dinero = dinero;
        }

        public Pago(String id, Date paymentDate, double dinero, String estado, String factura) {
                this.id = id;
                this.paymentDate = paymentDate;
                this.dinero = dinero;
                this.estado = estado;
                this.factura = factura;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Date getPaymentDate() {
                return paymentDate;
        }

        public void setPaymentDate(Date paymentDate) {
                this.paymentDate = paymentDate;
        }

        public double getDinero() {
                return dinero;
        }

        public void setDinero(double dinero) {
                this.dinero = dinero;
        }

        public String getEstado() {
                return estado;
        }

        public void setEstado(String estado) {
                this.estado = estado;
        }

        public String getFactura() {
                return factura;
        }

        public void setFactura(String factura) {
                this.factura = factura;
        }
}
