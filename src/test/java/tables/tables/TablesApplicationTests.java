package tables.tables;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import tables.tables.repos.DrugsRepo;

@SpringBootTest
@DataJpaTest
class TablesApplicationTests {
    @Autowired
    private DrugsRepo drugsRepo;

    @Test
    @DisplayName("get drugs")
    void get() {
        drugsRepo.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("add drug")
    void add() {
//        drugsRepo.save(new Drugs(1, "new", 10, new Manufacturer()));
    }
}
