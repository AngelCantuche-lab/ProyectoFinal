package everis.visitaSer.visitaSer.Repository;

import everisentidadesSQL.entidadesSQL.domain.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VisitaRepository extends JpaRepository<Visita,Integer> {

public Visita save(Visita visita);

Optional<Visita> findById(Integer id);

List<Visita> findAll();

void delete(Visita visita);

void deleteById(int id);


}
