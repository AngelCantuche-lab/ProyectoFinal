package everis.Cliente.clienteSer.service;

import everis.Cliente.clienteSer.repository.direccionRepository;
import everisentidadesSQL.entidadesSQL.domain.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class direccionService {

    @Autowired
    direccionRepository direccionRepository;

    public List<Direccion> getDireccion() {
        return direccionRepository.findAll();
    }

    public Optional<Direccion> getClienteDireccionId(int id) {
        return direccionRepository.findById(id);
    }

    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    public void delete(Direccion direccion) {
        direccionRepository.delete(Optional.ofNullable(direccion));
    }

    public void deleteById(int id) {
        direccionRepository.deleteById(id);

    }
}
