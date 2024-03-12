package tables.tables.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @OneToMany(mappedBy = "drug")
    private List<DrugstoreCount> drugstoreCount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "type_drugs",
            joinColumns = @JoinColumn(name = "id_drugs"),
            inverseJoinColumns = @JoinColumn(name = "id_type")
    )
    private List<Type> types;

    @Override
    public String toString() {
        return String.format("%d;%s;%d", id, name, price);
    }
}
