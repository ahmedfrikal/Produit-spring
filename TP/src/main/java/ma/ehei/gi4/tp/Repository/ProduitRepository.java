package ma.ehei.gi4.tp.Repository;

import ma.ehei.gi4.tp.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long>
{
    long number(Object unknownAttr1);
}
