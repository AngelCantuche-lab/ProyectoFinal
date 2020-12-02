package everis.Cliente.clienteSer.repository;

import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface clienteRepository extends JpaRepository <Cliente, Integer> {
    Cliente save(Cliente d);

    List<Cliente> findAll();

    Optional<Cliente> findById(int id);

    void delete(Optional<Cliente> cliente);

    void deleteById(int id);
}
