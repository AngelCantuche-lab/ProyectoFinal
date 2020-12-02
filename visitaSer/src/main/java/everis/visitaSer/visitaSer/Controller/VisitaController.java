package everis.visitaSer.visitaSer.Controller;

import everis.visitaSer.visitaSer.Service.VisitaService;
import everis.visitaSer.visitaSer.VisitaSerApplication;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Visita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class VisitaController {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    VisitaService visitaServicio;

    @HystrixCommand
    @GetMapping("/todos")
    public List<Visita> getVisita(){
        return visitaServicio.getVisita();
    }

    @HystrixCommand
    @GetMapping ("/{id}")
    public Optional<Visita> getVisita(@PathVariable("id") int id){
        return visitaServicio.getVisitaId(id);
    }

    @HystrixCommand
    @PostMapping("/guardar")
    public Visita saveVisita(@RequestBody Visita visita){

        return visitaServicio.save(visita);
    }

    @HystrixCommand
    @PutMapping("/modificar")
    public Visita modifyVisita(@RequestBody Visita visita){

        return visitaServicio.save(visita);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar")
    public void deleteVisita(@RequestBody Visita visita){
        visitaServicio.delete(visita);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar/{id}")
    public void deleteVisitaById(@PathVariable("id") int id){

        visitaServicio.deleteById(id);
    }
}
