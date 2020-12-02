package com.everis.factura.facturaSer.Repository;

import everis.entidadesMongo.entidadesMongo.Factura;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface FacturaRepositorySincrono {

    static Optional<Factura> findById(String id) {
        return null;//Arreglar con FacturaImp
    }
}
