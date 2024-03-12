package tables.tables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tables.tables.models.Category;
import tables.tables.models.Drugstore;
import tables.tables.models.Manufacturer;
import tables.tables.repos.CategoryRepo;
import tables.tables.repos.DrugsRepo;
import tables.tables.repos.DrugstoreRepo;
import tables.tables.repos.ManufactureRepo;

@SpringBootApplication
@RestController
public class TablesApplication {
    @Autowired
    private DrugsRepo drugsRepo;
    @Autowired
    private ManufactureRepo manufactureRepo;
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private DrugstoreRepo drugstoreRepo;

    public static void main(String[] args) {
        SpringApplication.run(TablesApplication.class, args);
    }

    @GetMapping("/get")
    public void get() {
        //  drugsRepo.findAll().forEach(System.out::println);
    }

    @GetMapping("/post")
    public void post() {
        Drugstore ds = new Drugstore(1, "shop", null);
        drugstoreRepo.save(ds);
        categoryRepo.save(new Category(1, "cat", null));
//        Manufacturer m = new Manufacturer(2, "manufact", null);
        Manufacturer m1 = manufactureRepo.findById(2).get();
//        System.out.println(m1);
//        manufactureRepo.save(m);
//        drugsRepo.save(new Drugs(null, "new", 10, m1, null));
//        drugsRepo.save(new Drugs(3, "new", 10, m));
//        drugsRepo.save(new Drugs(4, "new", 10, m));

    }

    @GetMapping("/del")
    public void del() {
//        manufactureRepo.deleteById(2);
    }
}
