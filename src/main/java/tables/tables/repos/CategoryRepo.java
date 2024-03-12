package tables.tables.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tables.tables.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
