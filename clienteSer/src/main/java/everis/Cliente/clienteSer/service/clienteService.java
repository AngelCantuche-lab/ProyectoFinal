package everis.Cliente.clienteSer.service;

import com.netflix.discovery.EurekaClient;
import everis.Cliente.clienteSer.repository.clienteRepository;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class clienteService {

    @Autowired
    private clienteRepository clienteRepository;
    @Autowired
    private direccionService direccionService;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteId(int id){
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delete (Cliente cliente){
        clienteRepository.delete(Optional.ofNullable(cliente));
    }

    public void deleteById(int id){
        clienteRepository.deleteById(id);

    }

    //FallBack
    public void facturaServiceDown(){
        System.out.println("ERROR: SERVICIO DOWN");
    }


}
