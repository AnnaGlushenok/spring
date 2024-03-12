package tables.tables.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tables.tables.models.Drugstore;

public interface DrugstoreRepo extends JpaRepository<Drugstore, Integer> {
}
