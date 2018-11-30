package trufas.carioca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trufas.carioca.domain.Trufas;

@Repository
public interface TrufasRepository extends JpaRepository<Trufas, Long> {
}
