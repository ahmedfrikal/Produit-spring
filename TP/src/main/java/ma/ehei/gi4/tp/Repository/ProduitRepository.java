package ma.ehei.gi4.tp.Repository;

import ma.ehei.gi4.tp.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long>
{
    List<Produit> findProduitByPrix (double prix);
}
