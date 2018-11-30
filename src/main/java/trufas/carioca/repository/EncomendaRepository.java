package trufas.carioca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trufas.carioca.domain.Encomenda;


@Repository
public interface EncomendaRepository extends JpaRepository<Encomenda, Long> {
}
