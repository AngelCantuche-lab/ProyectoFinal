package com.everis.factura.facturaSer.Repository;

import everis.entidadesMongo.entidadesMongo.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FacturaRepositoryReactive {

    static Mono<Factura> findBy(String id) {
        return null;//Arreglar
    }

    Mono<Factura> save(Factura nuevaFactura);

    Mono<Void> delete(Factura factura);

    Mono<Void> deleteById(String facturaId);

    Flux<Factura> findAll();

    Mono<Factura> modify(Factura factura);
}
