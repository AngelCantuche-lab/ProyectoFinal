package everis.Cliente.clienteSer.controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import everis.Cliente.clienteSer.service.direccionService;
import everis.Cliente.clienteSer.service.clienteService;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class clienteController {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private clienteService clienteService;

    @Autowired
    private direccionService direccionService;

    @HystrixCommand
    @GetMapping("/todos")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    @HystrixCommand
    @GetMapping ("/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") int id){
        return clienteService.getClienteId(id);
    }

    @HystrixCommand
    @PostMapping("/guardar")
    public Cliente saveCliente(@RequestBody Cliente cliente){

        return clienteService.save(cliente);
    }

    @HystrixCommand
    @PutMapping("/modificar")
    public Cliente modifyCliente(@RequestBody Cliente cliente){

        return clienteService.save(cliente);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar")
    public void deleteCliente(@RequestBody Cliente cliente){
        clienteService.delete(cliente);
    }

    @HystrixCommand
    @DeleteMapping("/eliminar/{id}")
    public void deleteClienteById(@PathVariable("id") int id){

        clienteService.deleteById(id);
    }
}
