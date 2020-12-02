package com.everis.factura.facturaSer.Controller;

import com.everis.factura.facturaSer.Service.FacturaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import everis.entidadesMongo.entidadesMongo.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class FacturaController {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @HystrixCommand
    @Autowired
    private FacturaService facturaService;

    @HystrixCommand
    @GetMapping("/todos")
    public List<Factura> getFacturaId(String id){
        return (List<Factura>) facturaService.getFacturaSinc(id);
    }

    @HystrixCommand
    @GetMapping ("/{id}")
    public Mono<Factura> getFactura(@PathVariable("id") String id){
        return facturaService.getFacturaId(id);
    }

    @HystrixCommand
    @PostMapping("/guardar")
    public Mono<Factura> saveFactura(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @HystrixCommand
    @PutMapping("/modificar")
    public Mono<Factura> modifyFactura(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar")
    public void deleteFactura(@RequestBody Factura factura){
        facturaService.delete(factura);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar/{id}")
    public void deleteFacturaById(@PathVariable("id") String id){
        facturaService.deleteById(id);
    }
}
