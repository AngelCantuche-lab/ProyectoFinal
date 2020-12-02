package com.everis.factura.facturaSer.Service;

import com.everis.factura.facturaSer.Repository.FacturaRepositoryReactive;
import com.everis.factura.facturaSer.Repository.FacturaRepositorySincrono;
import com.netflix.discovery.EurekaClient;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import everis.entidadesMongo.entidadesMongo.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

@Service
public class FacturaService {

    @Autowired
    RestTemplate balancedCall;

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;

    @Autowired
    FacturaRepositoryReactive facturaRepositoryReactive;

    @Autowired
    FacturaRepositorySincrono facturaRepositorySincrono;

    public Mono<Factura> getFacturaId(String id){
        Mono<Factura> factura= FacturaRepositoryReactive.findBy(id);
        if(factura!=null){
            return factura;
        }else{
            return null;
        }
    }

    public Factura getFacturaSinc (String id){
        Optional<Factura> factura = FacturaRepositorySincrono.findById(id);
        if(factura.isPresent()){
            return factura.get();
        }else{
            return null;
        }
    }

    public Mono<Factura> save(Factura nuevaFactura){
        return facturaRepositoryReactive.save(nuevaFactura);
    }

    public Mono<Void> delete(Factura factura){
        return facturaRepositoryReactive.delete(factura);
    }

    public Mono<Void> deleteById(String facturaId){
        return facturaRepositoryReactive.deleteById(facturaId);
    }

    public Flux<Factura> getAllFacturas(){
        return facturaRepositoryReactive.findAll();
    }

    public Mono<Factura> updateFactura(Factura factura){
        return facturaRepositoryReactive.modify(factura);
    }

    //FallBack
    public void pagoServiceDown(){
        System.out.println("SERVICIO FACTURA DOWN");
    }


}
