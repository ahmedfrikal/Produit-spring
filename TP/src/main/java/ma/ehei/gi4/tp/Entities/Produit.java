package ma.ehei.gi4.tp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.ehei.gi4.tp.Enums.TypeProduit;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Libelle;
    private float prix;
    private Long Qte;
    @Enumerated(EnumType.STRING)
    private TypeProduit typeProduit;
    @ManyToOne
    private Category category;
}
