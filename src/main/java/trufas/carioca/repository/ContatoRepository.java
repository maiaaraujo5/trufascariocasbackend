package trufas.carioca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trufas.carioca.domain.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
