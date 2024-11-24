package ma.hshaimi.virementservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Virement {
    @Id
    private String id;
    private String idBeneficiaire;
    private String ribSource;
    private double montant;
    private String description;
    private LocalDate date;
    private String type; // Normal ou Instantané
}
