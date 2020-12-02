package everis.Cliente.clienteSer.controller;


import everis.Cliente.clienteSer.service.clienteService;
import everis.Cliente.clienteSer.service.direccionService;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class direccionController {

    @Autowired
    private direccionService direccionService;

    @GetMapping("/todos")
    public List<Direccion> getDireccion(){
        return direccionService.getDireccion();
    }

    @GetMapping ("/{id}")
    public Optional<Direccion> getDireccion(@PathVariable("id") int id){
        return direccionService.getClienteDireccionId(id);
    }

    @PostMapping("/guardar")
    public Direccion saveDireccion(@RequestBody Direccion direccion){
        return direccionService.save(direccion);
    }

    @PutMapping("/modificar")
    public Direccion modifyDireccion(@RequestBody Direccion direccion){
        return direccionService.save(direccion);
    }

    @DeleteMapping("/eliminar")
    public void deleteDireccion(@RequestBody Direccion direccion){
        direccionService.delete(direccion);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteDireccionById(@PathVariable("id") int id){
        direccionService.deleteById(id);
    }
}
