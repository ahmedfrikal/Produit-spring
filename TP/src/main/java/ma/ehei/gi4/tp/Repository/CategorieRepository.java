package ma.ehei.gi4.tp.Repository;

import ma.ehei.gi4.tp.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Category,Long> {
}
