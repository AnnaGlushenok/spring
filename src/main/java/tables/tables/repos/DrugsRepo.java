package tables.tables.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tables.tables.models.Drug;

public interface DrugsRepo extends JpaRepository<Drug, Integer> {
}
