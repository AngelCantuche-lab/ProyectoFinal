package everis.Cliente.clienteSer.repository;

import everisentidadesSQL.entidadesSQL.domain.Direccion;

import java.util.List;
import java.util.Optional;

public interface direccionRepository {
    List<Direccion> findAll();

    Optional<Direccion> findById(int id);

    Direccion save(Direccion direccion);

    void delete(Optional<Direccion> direccion);

    void deleteById(int id);

}
