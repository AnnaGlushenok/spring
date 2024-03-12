package tables.tables.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DrugstoreCountKey implements Serializable {
    @Column(name = "id_drugs")
    int idDrug;
    @Column(name = "id_drugstore")
    int idDrugstore;

}
