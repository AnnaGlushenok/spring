package tables.tables.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugstoreCount implements Serializable {
    @EmbeddedId
    DrugstoreCountKey id;

    @ManyToOne
    @MapsId("idDrug")
    @JoinColumn(name = "id_drugs")
    Drug drug;

    @ManyToOne
    @MapsId("idDrugstore")
    @JoinColumn(name = "id_drugstore")
    Drugstore drugstore;

    int count;
}
