package tables.tables.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tables.tables.models.Manufacturer;

public interface ManufactureRepo extends JpaRepository<Manufacturer, Integer> {
}
