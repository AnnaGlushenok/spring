package tables.tables.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tables.tables.models.Type;

public interface TypeRepo extends JpaRepository<Type, Integer> {
}
